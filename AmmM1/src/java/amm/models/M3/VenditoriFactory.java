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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sara
 */
public class VenditoriFactory {
    /* Attributi */
    private static VenditoriFactory singleton;
    String connectionString;
    
    public static VenditoriFactory getInstance() {
        if (singleton == null) {
            singleton = new VenditoriFactory();
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
    private VenditoriFactory(){
    
    }
    
    /* Metodi */
    public Venditori getVenditore(String user, String password)
    {
        try {
            
            Connection conn = DriverManager.getConnection(connectionString, "saraflore", "1234");
            //Definizione query
            String query = "select * from venditore where "
                + "user = ? and password = ?";
            //Creazione statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano valori e posizioni 
            stmt.setString(1, user);
            stmt.setString(2, password);
            ResultSet res = stmt.executeQuery();
            //Effettua un ciclo sulle righe restituite
            if(res.next())
            {
                Venditori venditore = new Venditori();
                venditore.setUserVenditore(res.getString("user"));
                venditore.setPswVenditore(res.getString("password"));
                
                stmt.close();
                conn.close();
                return venditore;
            }
        }catch (SQLException ex) {
            Logger.getLogger(VenditoriFactory.class.getName()).log(Level.SEVERE, null, ex);
          }
        return null;
       
    } 

}

