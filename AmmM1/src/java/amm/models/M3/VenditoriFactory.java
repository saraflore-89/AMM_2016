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
public class VenditoriFactory {
    /* Attributi */
    private static VenditoriFactory singleton;
    public static VenditoriFactory getInstance() {
        if (singleton == null) {
            singleton = new VenditoriFactory();
        }
        return singleton;
    }

    /* Attributo che sarà richiamato nel costruttore */
    private ArrayList<Venditori> listaVenditori = new ArrayList<Venditori>();
    
    /* Costruttore */
    private VenditoriFactory(){
    
        /* Venditore 1 */
        Venditori v1 = new Venditori();         //creo un venditore
        v1.setUserVenditore("Giovanni85");     //aggiungo gli attributi
        v1.setPswVenditore("12345");
        v1.setIdVenditore(58);
        v1.setIdContoVenditore(125);
        listaVenditori.add(v1);                // lo aggiungo alla lista
         
        /* Venditore 2 */
        Venditori v2 = new Venditori();         //creo un venditore
        v2.setUserVenditore("Vanessa12");       //aggiungo gli attributi
        v2.setPswVenditore("tartaruga90");
        v2.setIdVenditore(13);
        v2.setIdContoVenditore(95);
        listaVenditori.add(v2);                // lo aggiungo alla lista
         
        /* Venditore 3 */
        Venditori v3 = new Venditori();         //creo un venditore
        v3.setUserVenditore("Francesca.S");     //aggiungo gli attributi
        v3.setPswVenditore("pippo");
        v3.setIdVenditore(20);
        v3.setIdContoVenditore(80);
        listaVenditori.add(v3);                // lo aggiungo alla lista
    }
    
    /* Metodi */
    
    /* Restituisce la lista di tutti i venditori */
    public ArrayList<Venditori> getVenditoriList()
    {
        return listaVenditori;
    }
    
    /* Restituisce un determinato venditore tramite il suo id, che è univoco */
    public Venditori getVenditore(int idVenditore)
    {
        for(Venditori u : listaVenditori)
        {
            if(u.idVenditore == idVenditore)
                return u;
        }
        return null;
    }

}

