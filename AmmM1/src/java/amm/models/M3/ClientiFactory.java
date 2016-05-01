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
public class ClientiFactory {
    
     /* Attributi */
    private static ClientiFactory singleton;
    public static ClientiFactory getInstance() {
        if (singleton == null) {
            singleton = new ClientiFactory();
        }
        return singleton;
    }

    /* Attributo che sarà richiamato nel costruttore */
    private ArrayList<Clienti> listaClienti = new ArrayList<Clienti>();
    
    /* Costruttore */
    private ClientiFactory(){
    
        /* Cliente 1 */
        Clienti c1 = new Clienti();             //creo un cliente
        c1.setUserCliente("Black77");     //aggiungo gli attributi
        c1.setPswCliente("98765");
        c1.setIdCliente(11);
        c1.setIdContoCliente(99);
        listaClienti.add(c1);                // lo aggiungo alla lista
         
        /* Cliente 2 */
        Clienti c2 = new Clienti();             //creo un cliente
        c2.setUserCliente("Anna88");       //aggiungo gli attributi
        c2.setPswCliente("giggetto");
        c2.setIdCliente(30);
        c2.setIdContoCliente(140);
        listaClienti.add(c2);                // lo aggiungo alla lista
    
    }
    
    /* Metodi */
    
    /* Restituisce la lista di tutti i clienti */
    public ArrayList<Clienti> getClientiList()
    {
        return listaClienti;
    }
    
    /* Restituisce un determinato cliente tramite il suo id, che è univoco */
    public Clienti getClienti(int idCliente)
    {
        for(Clienti u : listaClienti)
        {
            if(u.idCliente == idCliente)
                return u;
        }
        return null;
    }

    
}
