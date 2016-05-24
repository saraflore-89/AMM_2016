/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.models.M3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author Sara
 */
public class OggettiVenditaFactory {
    
     /* Attributi */
    private static OggettiVenditaFactory singleton;
    String connectionString;
    
    public static OggettiVenditaFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettiVenditaFactory();
        }
        return singleton;
    }
    
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    public String getConnectionString(){
            return this.connectionString;
    }
    
    /* Costruttore */
    private OggettiVenditaFactory(){
    }
    
     /* Metodi */
    public OggettiVendita getOggetto (String nomeOgg, String urlOgg, Double prezzoOgg, int quantitaOgg)
    {
        try{
            Connection conn = DriverManager.getConnection(connectionString, "saraflore", "1234");
            //Definizione query
            String query = "select * from oggettiVendita where "
                + "idOggetto = ? and nomeOgg = ? and urlOgg = ? and descrizioneOgg = ? "
                + "prezzoOgg = ? and quantitaOgg = ? and idVenditoreOgg = ?";
            //Creazione statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano valori e posizioni 
            
            stmt.setString(1, nomeOgg);
            stmt.setString(2, urlOgg);
            stmt.setDouble(3, prezzoOgg);
            stmt.setInt(4, quantitaOgg);
           
            ResultSet res = stmt.executeQuery();
            //Effettua un ciclo sulle righe restituite
            if(res.next())
            {
                OggettiVendita ogg = new OggettiVendita();
                ogg.setNomeOggetto(res.getString("nomeOgg"));
                ogg.setUrlOggetto(res.getString("urlOgg"));
                ogg.setPrezzoOggetto(res.getDouble("prezzoOgg"));
                ogg.setQuantitaOggetto(res.getInt(quantitaOgg));
                
                
                stmt.close();
                conn.close();
                return ogg;
            }
        }catch (SQLException ex) {
            Logger.getLogger(OggettiVenditaFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
    
}

