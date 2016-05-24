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
/**
 *
 * @author Sara
 */
public class ClientiFactory {
    
     /* Attributi */
    private static ClientiFactory singleton;
    private String connectionString;
    
    public static ClientiFactory getInstance() {
        if (singleton == null) {
            singleton = new ClientiFactory();
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
    private ClientiFactory(){
    }
    
    /* Metodi */
    public Clienti getClienti(String user, String password)
    {
        try {
            
            Connection conn = DriverManager.getConnection(connectionString, "saraflore", "1234");
            //Definizione query
            String query = "select * from cliente where "
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
                Clienti cliente = new Clienti();
                cliente.setUserCliente(res.getString("user"));
                cliente.setPswCliente(res.getString("password"));
                
                stmt.close();
                conn.close();
                return cliente;
            }
        }catch (SQLException ex) {
            Logger.getLogger(ClientiFactory.class.getName()).log(Level.SEVERE, null, ex);
          }
        return null;
    }
    
    
    
}
