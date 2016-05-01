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
public class Venditori {
    //Attributi
    String userVenditore;
    String pswVenditore;
    public int idVenditore;
    int idContoV;


    Venditori(){

    }

    public String getUserVenditore(){

        return userVenditore;
    }

    public void setUserVenditore(String userVenditore){

        this.userVenditore = userVenditore;
    }

    public String getPswVenditore(){

        return pswVenditore; 
    }

    public void setPswVenditore(String pswVenditore){

        this.pswVenditore = pswVenditore;
    }

    public int getIdVenditore(){

        return idVenditore;
    }

    public void setIdVenditore(int idVenditore){

        this.idVenditore = idVenditore;
    }

    public int getIdContoVenditore(){

        return idContoV;
    }

    public void setIdContoVenditore(int idContoV){

        this.idContoV = idContoV;
    }
}
