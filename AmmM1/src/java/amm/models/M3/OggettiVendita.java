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
public class OggettiVendita {
    //Attributi
    String nomeOgg;
    String urlOgg;
    String descrizioneOgg;
    Double prezzoOgg;
    int quantitaOgg;
    int idOggetto;
    int idVenditoreOgg;
    
    public OggettiVendita(){
    
    }
    
    public String getNomeOggetto(){

        return nomeOgg;
    }

    public void setNomeOggetto(String nomeOgg){

        this.nomeOgg = nomeOgg;
    }
    
    public String getUrlOggetto(){

        return urlOgg;
    }

    public void setUrlOggetto(String urlOgg){

        this.urlOgg = urlOgg;
    }
    
    public String getDescrizioneOggetto(){

        return descrizioneOgg;
    }

    public void setDescrizioneOggetto(String descrizioneOgg){

        this.descrizioneOgg = descrizioneOgg;
    }
    
    public Double getPrezzoOggetto(){

        return prezzoOgg;
    }

    public void setPrezzoOggetto(Double prezzoOgg){

        this.prezzoOgg = prezzoOgg;
    }
    
    public int getQuantitaOggetto(){

        return quantitaOgg;
    }

    public void setQuantitaOggetto(int quantitaOgg){

        this.quantitaOgg = quantitaOgg;
    }
    
    public int getIdOggetto(){

        return idOggetto;
    }

    public void setIdOggetto(int idOggetto){

        this.idOggetto = idOggetto;
    }
    
    public int getIdVenditoreOggetto(){

        return idVenditoreOgg;
    }

    public void setIdVenditoreOggetto(int idVenditoreOgg){

        this.idVenditoreOgg = idVenditoreOgg;
    }
    
}
