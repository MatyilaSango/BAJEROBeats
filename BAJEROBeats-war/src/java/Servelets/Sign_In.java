/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import DAOs.ProductsDao;
import DAOs.UserDao;
import Entities.Products;
import Entities.User;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sango
 */
@WebServlet(name = "Sign_In", urlPatterns = {"/Sign_In"})
public class Sign_In extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Sign_In</title>");            
            out.println("</head>");
            out.println("<body>");
     
            String username = (String) request.getParameter("username");
            String password = (String) request.getParameter("password");
            try{
                out.println("<h1>Please wait!</h1>");
                UserDao userdao = new UserDao();
                User user = userdao.findUser(username, password);
                
                HttpSession session = request.getSession();
                session.setAttribute("username", "not null"/*user.getUsername()*/);
                
                //Retrieving latest produt.
                ProductsDao pdao = new ProductsDao();
                Products product = pdao.readAllProducts().get(0);
                
                //Products product = new Products(0, "Paradise expansion pack", 500, 2500, "https://bajero.com/paradise-expansion-pack.jpg", "https://bajero.com/paradise-expansion-pack.zip", new Date());
                
                Gson gson = new Gson();
                String latestMediaJSON = gson.toJson(product, Products.class);
                
                request.setAttribute("latestMediaJSON", latestMediaJSON);
                
                request.getServletContext().getRequestDispatcher("/Home.jsp").forward(request, response);
                
            }catch(IllegalStateException e){
                request.setAttribute("confStatus", "error"+e.getMessage());
                out.println("<h1>"+e.getMessage()+"</h1>");
                request.getServletContext().getRequestDispatcher("/sign in.jsp").forward(request, response);
                
            }
            catch(NoResultException e){
                request.setAttribute("error", "Incorrect username or password!");
                request.getServletContext().getRequestDispatcher("/sign in.jsp").forward(request, response);
            }
            
            out.println("<h1>Please wait!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        return "Process sign in details.";
    }// </editor-fold>

}
