package result;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowResult extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
//int roll=Integer.parseInt(request.getParameter("roll"));
int roll=(Integer)request.getSession().getAttribute("roll");            
ServletContext ctx=this.getServletContext();
Class.forName(ctx.getInitParameter("drv"));
Connection con=DriverManager.getConnection(ctx.getInitParameter("url"), ctx.getInitParameter("dbid"),ctx.getInitParameter("dbpass"));
PreparedStatement ps=con.prepareStatement("select * from marks where roll=?");        
ps.setInt(1, roll);
ResultSet rs=ps.executeQuery();
boolean found=rs.next();
if(found){
    int s1=rs.getInt(2);
    int s2=rs.getInt(3);
    int s3=rs.getInt(4);
    int s4=rs.getInt(5);
    int s5=rs.getInt(6);
    int total=s1+s2+s3+s4+s5;
    double per=total/5;
out.println("<table border=4 width=4 cellspacing=3 cellpadding=3>");
    out.println("<thead>");
        out.println("<tr>");
            out.println("<th>Sno</th>");
            out.println("<th>Subject</th>");
            out.println("<th>Marks Obtained</th>");
            out.println("<th>Total</th>");
        out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody>");
        out.println("<tr>");
            out.println("<td>1</td>");
            out.println("<td>OOPS</td>");
            out.println("<td>"+s1+"</td>");
            out.println("<td>100</td>");
        out.println("</tr>");
        out.println("<tr>");
            out.println("<td>2</td>");
            out.println("<td>RDBMS</td>");
            out.println("<td>"+s2+"</td>");
            out.println("<td>100</td>");
        out.println("</tr>");
        out.println("<tr>");
            out.println("<td>3</td>");
            out.println("<td>TOC</td>");
            out.println("<td>"+s3+"</td>");
            out.println("<td>100</td>");
        out.println("</tr>");
        out.println("<tr>");
            out.println("<td>4</td>");
            out.println("<td>COOT</td>");
            out.println("<td>"+s4+"</td>");
            out.println("<td>100</td>");
        out.println("</tr>");
        out.println("<tr>");
            out.println("<td>5</td>");
            out.println("<td>ADA</td>");
            out.println("<td>"+s5+"</td>");
            out.println("<td>100</td>");
        out.println("</tr>");
        out.println("<tr>");
            out.println("<td colspan=2 align=center><b>Total</td>");
            out.println("<td><b>"+total+"</td>");
            out.println("<td><b>500</td>");
        out.println("</tr>");
        out.println("</tbody>");
    out.println("</table>");
}
else{
out.println("<h2>Roll No Not Found......");
}
con.close();
        } catch (SQLException ex) {
           out.println(ex);
        } catch (ClassNotFoundException ex) {
            out.println(ex);
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
