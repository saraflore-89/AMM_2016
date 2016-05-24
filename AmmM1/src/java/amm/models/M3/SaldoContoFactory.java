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
public class SaldoContoFactory {
    
     /* Attributi */
    private static SaldoContoFactory singleton;
    String connectionString;
    
    public static SaldoContoFactory getInstance() {
        if (singleton == null) {
            singleton = new SaldoContoFactory();
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
    private SaldoContoFactory(){
    }
    
     /* Metodi */
    public SaldoConto getConto (int idConto, Double saldo)
    {
        try {
            
            Connection conn = DriverManager.getConnection(connectionString, "saraflore", "1234");
            //Definizione query
            String query = "select * from saldoConto where "
                + "idConto = ? and saldo = ?";
            //Creazione statement
            PreparedStatement stmt = conn.prepareStatement(query);
            // Si associano valori e posizioni 
            stmt.setInt(1, idConto);
            stmt.setDouble(2, saldo);
            ResultSet res = stmt.executeQuery();
            //Effettua un ciclo sulle righe restituite
            if(res.next())
            {
                SaldoConto s = new SaldoConto();
                s.setIdConto(res.getInt(idConto));
                s.setSaldo(res.getDouble("saldo"));
                
                stmt.close();
                conn.close();
                return s;
            }
        }catch (SQLException ex) {
            Logger.getLogger(SaldoContoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
