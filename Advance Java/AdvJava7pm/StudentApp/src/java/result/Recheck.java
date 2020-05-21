/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package result;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author LABOPAL01
 */
public class Recheck extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
int roll=(Integer)request.getSession().getAttribute("roll");    
String sub[]=request.getParameterValues("sub");
if(sub!=null){
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stds","root","root");
PreparedStatement ps=con.prepareStatement("insert into rechecking values(?,?)");        
for(int i=0;i<sub.length;i++){
ps.setInt(1,roll);
ps.setString(2, sub[i]);
ps.executeUpdate();
}
out.println("<h2>U have applied for "+sub.length+" subjects</h2>");
out.println("<h3>so,u need to pay Rs. : "+sub.length*500+"</h3>");
out.println("<a href=student.jsp>Home</a>");
con.close();
}
else{
out.println("<h2>Subject is not selected....</h2><br>");
out.println("<a href=reval.jsp>please try again</a>");
}
        
        } catch (SQLException ex) {
            Logger.getLogger(Recheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Recheck.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
