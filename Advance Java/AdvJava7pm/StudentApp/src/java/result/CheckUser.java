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
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
String uid=request.getParameter("uid");
String pass=request.getParameter("pass");
String utype=request.getParameter("utype");
String save=request.getParameter("save");
if(utype.equals("Admin")){
    ServletConfig cfg=this.getServletConfig();
    String aid=cfg.getInitParameter("adminid");
    String aps=cfg.getInitParameter("adminpass");
if(uid.equals(aid) && pass.equals(aps))
    response.sendRedirect("adminhome.jsp");
else{
    out.println("<h2>Invalid Admin Details.....</h2>");
    out.println("<a href=login.jsp>Try-Again</a>");
}
    
}
else if(utype.equals("Student")){
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stds","root","root");    
PreparedStatement ps=con.prepareStatement("select* from student where roll=? and password=?");
ps.setString(1, uid);
ps.setString(2, pass);
ResultSet rs=ps.executeQuery();
boolean found=rs.next();
int roll=rs.getInt(1);
String sname=rs.getString(2);
HttpSession session=request.getSession();
session.setAttribute("roll", roll);
session.setAttribute("sname", sname);
if(save!=null){
        //create the cookies
            Cookie ck1=new Cookie("uid", uid);
            Cookie ck2=new Cookie("pass", pass );
           //set the life time of the cookies
            
            ck1.setMaxAge(60*60*24);
            //ck2.setMaxAge(60*60);
            
            //add cookies to the response
            response.addCookie(ck1);
            response.addCookie(ck2);
}



if(found)
    response.sendRedirect("student.jsp");
else{
    out.println("<h2>Invalid Student Details.....</h2>");
    out.println("<a href=login.jsp>Try-Again</a>");
}
}

        } catch (SQLException ex) {
            Logger.getLogger(CheckUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CheckUser.class.getName()).log(Level.SEVERE, null, ex);
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
