/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LABOPAL01
 */
public class TaxController extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
   //Fetch the inputs
int income=Integer.parseInt(request.getParameter("income"));            
int age=Integer.parseInt(request.getParameter("age"));
int deduction=Integer.parseInt(request.getParameter("deduction"));
   //Instantiate the bean
tax.TaxBeans tbean=new tax.TaxBeans();
    //populate the bean with form data
tbean.setIncome(income);
tbean.setAge(age);
tbean.setDeduction(deduction);
   //preserve the bean
//request.getSession().setAttribute("tbean", tbean);
request.setAttribute("tbean", tbean);
   //fetch the output from bean
int n=tbean.getNettaxamt();
//check the output and decide the view         
String view="";
if(n>0)
    view="showTax.jsp";
else
    view="noTax.jsp";
   //forward to the view         
//response.sendRedirect(view);
request.getRequestDispatcher(view).forward(request, response);
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
