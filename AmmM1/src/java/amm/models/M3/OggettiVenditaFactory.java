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
    
    private String nomeOgg;
    private Double prezzoOgg;
    private int quantitaOgg;
    private String urlOgg;
    private int idConto;
    private int idVenditoreOgg;
    private int idOggetto;
    private String sql;
    
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
                + "nomeOgg = ? and urlOgg = ? and "
                + "prezzoOgg = ? and quantitaOgg = ?";
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
    
    ArrayList<OggettiVendita> listaOggetti = new ArrayList <OggettiVendita>();
    
    public ArrayList<OggettiVendita> getCreaOggetto(int idOggetto) throws SQLException{

    try {
        
            Connection conn = DriverManager.getConnection(connectionString, "saraflore", "1234"); 
            String query = "INSERT INTO oggetto (idOggetto, nomeOgg, urlOgg, "
                + "prezzoOgg, quantitaOgg, idVenditoreOgg, idConto)"+"VALUES(?,?,?,?,?,?)";
        
             PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano valori e posizioni 
            stmt.setInt(1, idOggetto);
            stmt.setString(2, nomeOgg);
            stmt.setDouble(3, prezzoOgg);
            stmt.setInt(4, quantitaOgg);
            stmt.setString(5, urlOgg);
            stmt.setInt(6, idVenditoreOgg);
            stmt.setInt(7, idConto);
            
            ResultSet set = stmt.executeQuery();
            
            if (set.next()) {
                OggettiVendita oggetto = new OggettiVendita();
                oggetto.nomeOgg = set.getString("nomeOgg");
                oggetto.prezzoOgg = set.getDouble("prezzoOgg");
                oggetto.quantitaOgg = set.getInt(quantitaOgg);
                oggetto.urlOgg = set.getString("urlOgg");
                listaOggetti.add(oggetto);

            stmt.close();
            conn.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(OggettiVenditaFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    
        return listaOggetti;
        }
     public ArrayList<OggettiVendita> getRecuperaOggetto(String text)
    {
        ArrayList<OggettiVendita> lista = new ArrayList <OggettiVendita>();
        
        try
        {
            Connection conn = DriverManager.getConnection(connectionString, "saraflore", "1234" );
            String query = "select *" +
                           "from oggetto " + 
                           "where oggetto.nomeOgg LIKE ?";         
            PreparedStatement stmt = conn.prepareStatement(query);
            // Assegna dati
            text = "%"+text+"%";
            stmt.setString(1, text);
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                OggettiVendita curr = new OggettiVendita();
                curr.setIdOggetto(res.getInt("idOggetto"));
                curr.setNomeOggetto(res.getString("nomeOgg"));
                curr.setPrezzoOggetto(res.getDouble("prezzoOgg"));
                curr.setQuantitaOggetto(res.getInt("quantitaOgg"));
                curr.setUrlOggetto(res.getString("urlOgg"));
                lista.add(curr);
            }
            
            stmt.close();
            conn.close();
        }
        catch(SQLException e){
            Logger.getLogger(OggettiVenditaFactory.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return lista;
    }
    
}

