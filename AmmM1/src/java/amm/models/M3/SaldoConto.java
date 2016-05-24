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
    Double saldo;
    
    SaldoConto(){
    
    }
    
    public int getIdConto (){
        
        return idConto;
    }
    
    public void setIdConto (int idConto){
        
        this.idConto = idConto;
    }
    
    public Double getSaldo(){
        
        return saldo;
    }
    
    public void setSaldo(Double saldo){
        
        this.saldo = saldo;
    }
    
    
}
