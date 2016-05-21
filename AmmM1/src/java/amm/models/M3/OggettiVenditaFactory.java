/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.models.M3;

import java.util.ArrayList;

/**
 *
 * @author Sara
 */
public class OggettiVenditaFactory {
    
     /* Attributi */
    private static OggettiVenditaFactory singleton;
    public static OggettiVenditaFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettiVenditaFactory();
        }
        return singleton;
    }
    
    /* Attributo che sarà richiamato nel costruttore */
    private ArrayList<OggettiVendita> listaOggetti = new ArrayList<OggettiVendita>();
    
    /* Costruttore */
    private OggettiVenditaFactory(){
        
        /*Oggetto 1*/
        OggettiVendita ogg1 = new OggettiVendita();        //creo un oggetto
        //aggiungo gli attributi
        ogg1.setNomeOggetto("Fondotinta biologico - PuroBio Cosmetics"); 
        ogg1.setUrlOggetto("img/fondotinta_purobio_cosmetics.jpg");
        ogg1.setDescrizioneOggetto("Fondotinta liquido biologico");
        ogg1.setPrezzoOggetto(13.90);
        ogg1.setQuantitaOggetto(10);
        ogg1.setIdOggetto(20);
        ogg1.setIdVenditoreOggetto(58);
        listaOggetti.add(ogg1);                       // lo aggiungo alla lista

        /* Oggetto 2 */
        OggettiVendita ogg2 = new OggettiVendita();        //creo un oggetto
        //aggiungo gli attributi
        ogg2.setNomeOggetto("Shade Fusion Trio Blush -Kiko Cosmetics");                          
        ogg2.setUrlOggetto("img/blush_kiko.png");
        ogg2.setDescrizioneOggetto("Blush kiko");
        ogg2.setPrezzoOggetto(8.90);
        ogg2.setQuantitaOggetto(15);
        ogg2.setIdOggetto(21);
        ogg2.setIdVenditoreOggetto(58);
        listaOggetti.add(ogg2);                       // lo aggiungo alla lista
        
        /* Oggetto 3 */
        OggettiVendita ogg3 = new OggettiVendita();        //creo un oggetto
        //aggiungo gli attributi
        ogg3.setNomeOggetto("Palette Chocolate Bar - Too Faced");                           
        ogg3.setUrlOggetto("img/chocolate_bar_too_faced.jpg");
        ogg3.setDescrizioneOggetto("Palette ombretti");
        ogg3.setPrezzoOggetto(45.00);
        ogg3.setQuantitaOggetto(5);
        ogg3.setIdOggetto(30);
        ogg3.setIdVenditoreOggetto(13);
        listaOggetti.add(ogg3);                       // lo aggiungo alla lista
        
        /* Oggetto 4 */
        OggettiVendita ogg4 = new OggettiVendita();        //creo un oggetto
        //aggiungo gli attributi
        ogg4.setNomeOggetto("Mascara volume I Love Extreme - Essence");                           
        ogg4.setUrlOggetto("img/I_love_extreme_volume_mascara.png");
        ogg4.setDescrizioneOggetto("Mascara");
        ogg4.setPrezzoOggetto(3.29);
        ogg4.setQuantitaOggetto(20);
        ogg4.setIdOggetto(5);
        ogg4.setIdVenditoreOggetto(13);
        listaOggetti.add(ogg4);                       // lo aggiungo alla lista
        
        /* Oggetto 5 */
        OggettiVendita ogg5 = new OggettiVendita();        //creo un oggetto
        //aggiungo gli attributi
        ogg5.setNomeOggetto("Rossetto Ruby Woo - MAC Cosmetics");                           
        ogg5.setUrlOggetto("img/red-lipstick-MAC-Ruby-Woo.jpg");
        ogg5.setDescrizioneOggetto("Rossetto rosso");
        ogg5.setPrezzoOggetto(19.00);
        ogg5.setQuantitaOggetto(10);
        ogg5.setIdOggetto(45);
        ogg5.setIdVenditoreOggetto(20);
        listaOggetti.add(ogg5);                       // lo aggiungo alla lista
    }
    
     /* Metodi */
    
    /* Restituisce la lista di tutti gli oggetti */
    public ArrayList<OggettiVendita> getOggettiList()
    {
        return listaOggetti;
    }
    
    /* Restituisce un determinato oggetto tramite il suo id, che è univoco */
    public OggettiVendita getOggetto (int idOggetto)
    {
        for(OggettiVendita u : listaOggetti)
        {
            if(u.idOggetto == idOggetto)
                return u;
        }
        return null;
    }
    
    public void aggiungiOgg(OggettiVendita newOggetto)
    {
        this.listaOggetti.add(newOggetto);
    }

}

