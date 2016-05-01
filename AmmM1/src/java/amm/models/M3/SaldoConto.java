/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.models.M3;

/**
 *
 * @author Sara
 */
public class SaldoConto {
    //Atributi
    public int idConto;
    int saldo;
    
    SaldoConto(){
    
    }
    
    public int getIdConto (){
        
        return idConto;
    }
    
    public void setIdConto (int idConto){
        
        this.idConto = idConto;
    }
    
    public int getSaldo(){
        
        return saldo;
    }
    
    public void setSaldo(int saldo){
        
        this.saldo = saldo;
    }
    
    
}
