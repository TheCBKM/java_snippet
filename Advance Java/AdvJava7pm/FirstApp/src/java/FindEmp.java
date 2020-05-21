import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindEmp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
int eno=Integer.parseInt(request.getParameter("eno"));
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "root");
PreparedStatement ps=con.prepareStatement("select * from emp where empno=?");
ps.setInt(1, eno);        
ResultSet rs=ps.executeQuery();
boolean found=rs.next();
if(found){
String enm=rs.getString(2);
String job=rs.getString(3);
int sal=rs.getInt(4);
int comm=rs.getInt(5);
int total=sal+comm;
/*out.println("The Ename is : "+enm+"<br>");
out.println("The Job is : "+job+"<br>");
out.println("The Salary is : "+sal+"<br>");
out.println("The Comm is : "+comm+"<br>");
out.println("The Gross Income is : "+total+"<br>");*/
out.println("<table border=3 width=2 cellspacing=2 cellpadding=3>");
    out.println("<thead>");
        out.println("<tr>");
            out.println("<th>Emp Code</th>");
            out.println("<th>Name</th>");
            out.println("<th>Designation</th>");
            out.println("<th>Salary</th>");
            out.println("<th>Comm</th>");
        out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody>");
        out.println("<tr>");
            out.println("<td>"+eno+"</td>");
            out.println("<td>"+enm+"</td>");
            out.println("<td>"+job+"</td>");
            out.println("<td>"+sal+"</td>");
            out.println("<td>"+comm+"</td>");
        out.println("</tr>");
    out.println("</tbody>");
out.println("</table>");
        }
else
    out.println("Empno not Found.....");
con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FindEmp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FindEmp.class.getName()).log(Level.SEVERE, null, ex);
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
