/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hib;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LABOPAL01
 */
public class AddEmp extends HttpServlet {

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
int eno=Integer.parseInt(request.getParameter("eno"));
String enm=request.getParameter("enm");
String job=request.getParameter("job");
int sal=Integer.parseInt(request.getParameter("sal"));
int dno=Integer.parseInt(request.getParameter("dno"));

Session session=hib.HibernateUtil.getSessionFactory().openSession();
/*hib.Emp e1=new hib.Emp();
e1.setDeptno(dno);
e1.setEmpno(eno);
e1.setEname(enm);
e1.setJob(job);
e1.setSal(sal);*/
hib.Emp e1=new hib.Emp(eno, enm, job, sal, dno);
session.save(e1);
Transaction tr=session.beginTransaction();
tr.commit();
out.println("<h2>Emp Registered Successfully....</h2>");
out.println("<a href=add.jsp>Add More Record</a><br>");
out.println("<a href=index.jsp>Home</a><br>");
        } catch (Exception ex) {
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
