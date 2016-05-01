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
public class Clienti {
    //Attributi
    String userCliente;
    String pswCliente;
    public int idCliente;
    int idContoC;


    Clienti(){

    }

    public String getUserCliente(){

        return userCliente;
    }

    public void setUserCliente(String userCliente){

        this.userCliente = userCliente;
    }

    public String getPswCliente(){

        return pswCliente; 
    }

    public void setPswCliente(String pswCliente){

        this.pswCliente = pswCliente;
    }

    public int getIdCliente(){

        return idCliente;
    }

    public void setIdCliente (int idCliente){

        this.idCliente = idCliente;
    }

    public int getIdContoCliente(){

        return idContoC;
    }

    public void setIdContoCliente(int idContoC){

        this.idContoC = idContoC;
    }

} 
