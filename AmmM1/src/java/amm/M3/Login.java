/*
 * To /change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.M3;

import amm.models.M3.OggettiVenditaFactory;
import amm.models.M3.ClientiFactory;
import amm.models.M3.Clienti;
import amm.models.M3.Venditori;
import amm.models.M3.VenditoriFactory;
import amm.models.M3.SaldoContoFactory;
import amm.models.M3.SaldoConto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "Login", urlPatterns = {"/login.html"}, loadOnStartup = 0)
public class Login extends HttpServlet {
    
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db/ammdb";
    private static final String DB_BUILD_PATH = "WEB-INF/db/ammdb";
    
    @Override 
    public void init(){
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        OggettiVenditaFactory.getInstance().setConnectionString(dbConnection);
        ClientiFactory.getInstance().setConnectionString(dbConnection);
        VenditoriFactory.getInstance().setConnectionString(dbConnection);
        SaldoContoFactory.getInstance().setConnectionString(dbConnection);
        
    }

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

        //creo la sessione
        HttpSession session = request.getSession(true);

        if (request.getParameter("Submit") != null) {
            // Preleva i dati inviati
            String username = request.getParameter("user");
            String password = request.getParameter("pswd");

            Clienti c = ClientiFactory.getInstance().getClienti(username, password);
            
                if (username.equals(c.getUserCliente()) && password.equals(c.getPswCliente())) 
                {
                    session.setAttribute("loggedIn", true);
                    session.setAttribute("id", c.getIdCliente());

                    session.setAttribute("logVenditore", false);
                    session.setAttribute("logCliente", true);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);

                }

            

            Venditori v = VenditoriFactory.getInstance().getVenditore(username, password);
            
                if (username.equals(v.getUserVenditore()) && password.equals(v.getPswVenditore()))
                {
                    session.setAttribute("loggedIn", true);
                    session.setAttribute("id", v.getIdVenditore());
                    
                    session.setAttribute("logVenditore", true);
                    session.setAttribute("logCliente", false);
                    request.getRequestDispatcher("venditore.jsp").forward(request, response);

                }
        
                request.setAttribute("Errore", true);
              
        
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);

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
