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
public class SaldoContoFactory {
    
     /* Attributi */
    private static SaldoContoFactory singleton;
    public static SaldoContoFactory getInstance() {
        if (singleton == null) {
            singleton = new SaldoContoFactory();
        }
        return singleton;
    }
    
    /* Attributo che sarà richiamato nel costruttore */
    private ArrayList<SaldoConto> listaConti = new ArrayList<SaldoConto>();
    
    /* Costruttore */
    private SaldoContoFactory(){
        
        /*Conto 1*/
        SaldoConto conto1 = new SaldoConto();             //creo un conto
        conto1.setIdConto(125);                           //aggiungo gli attributi
        conto1.setSaldo(500);
        listaConti.add(conto1);                           // lo aggiungo alla lista

        /* Conto 2 */
        SaldoConto conto2 = new SaldoConto();             //creo un conto
        conto2.setIdConto(95);                           //aggiungo gli attributi
        conto2.setSaldo(600);
        listaConti.add(conto2);                           // lo aggiungo alla lista
        
        /* Conto 3 */
        SaldoConto conto3 = new SaldoConto();             //creo un conto
        conto3.setIdConto(80);                           //aggiungo gli attributi
        conto3.setSaldo(300);
        listaConti.add(conto3);                           // lo aggiungo alla lista
        
        /* Conto 4 */
        SaldoConto conto4 = new SaldoConto();             //creo un conto
        conto4.setIdConto(99);                           //aggiungo gli attributi
        conto4.setSaldo(80);
        listaConti.add(conto4);                           // lo aggiungo alla lista
        
        /* Conto 5 */
        SaldoConto conto5 = new SaldoConto();             //creo un conto
        conto5.setIdConto(140);                           //aggiungo gli attributi
        conto5.setSaldo(50);
        listaConti.add(conto5);                           // lo aggiungo alla lista
    }
    
     /* Metodi */
    
    /* Restituisce la lista di tutti i conti */
    public ArrayList<SaldoConto> getContiList()
    {
        return listaConti;
    }
    
    /* Restituisce un determinato conto tramite il suo id, che è univoco */
    public SaldoConto getConto (int idConto)
    {
        for(SaldoConto u : listaConti)
        {
            if(u.idConto == idConto)
                return u;
        }
        return null;
    }

}
