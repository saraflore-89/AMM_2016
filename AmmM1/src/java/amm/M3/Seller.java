/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.M3;

import amm.models.M3.OggettiVendita;
import amm.models.M3.OggettiVenditaFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sara
 */
@WebServlet(name = "Seller", urlPatterns = {"/venditore.html"})
public class Seller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(false);
        
        if(session.getAttribute("loggedIn").equals(true) &&
           session.getAttribute("logVenditore").equals(true)){
            //esiste una sessione di un venditore, aggiungiamo il prodotto
            if(request.getParameter("Submit") != null)
                {
                    OggettiVendita nuovoProdotto = new OggettiVendita();
                    nuovoProdotto.setNomeOggetto(request.getParameter("NomeOggetto"));
                    nuovoProdotto.setUrlOggetto(request.getParameter("UrlOggetto"));
                    nuovoProdotto.setDescrizioneOggetto(request.getParameter("DescrizioneOggetto"));
                    nuovoProdotto.setPrezzoOggetto(Double.parseDouble(request.getParameter("Prezzo")));
                    nuovoProdotto.setQuantitaOggetto(Integer.parseInt(request.getParameter("Quantità")));
                    
                    Random rand = new Random();
                    nuovoProdotto.setIdOggetto(rand.nextInt(50));
                    
                    OggettiVenditaFactory.getInstance().aggiungiOgg(nuovoProdotto);
                    session.setAttribute("listaOggetti", OggettiVenditaFactory.getInstance().getOggettiList());
                    session.setAttribute("NewProdotto", nuovoProdotto);
                }
            //manca questo file
            request.getRequestDispatcher("confermaInserimento.jsp").forward(request, response);
        }
        request.getRequestDispatcher("venditore.jsp").forward(request, response);


        
    }

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
