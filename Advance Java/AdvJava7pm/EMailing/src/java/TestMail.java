import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestMail extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
String to=request.getParameter("to");
String cc=request.getParameter("cc");
final String from=request.getParameter("from");
final String pass=request.getParameter("pass");
String sub=request.getParameter("sub");
String cnt=request.getParameter("cnt");
//create and set the properies
Properties pro=System.getProperties();
pro.setProperty("mail.smtp.host", "smtp.gmail.com");
pro.setProperty("mail.smtp.auth", "true");
pro.setProperty("mail.smtp.starttls.enable", "true");
//create the session
Session session=Session.getDefaultInstance(pro, new Authenticator(){
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from ,pass);
                }
});
//create the message
MimeMessage msg=new MimeMessage(session);
msg.addRecipient(RecipientType.TO,new InternetAddress(to));
msg.addRecipient(RecipientType.CC, new InternetAddress(cc));
msg.setFrom(new InternetAddress(from));
msg.setSubject(sub);
msg.setText(cnt);
//sent the mail
Transport.send(msg);
out.println("<h3>Mail sent sucessfully.....</h3>");
out.println("<a href=index.jsp>Send more</a>");


        
        } catch (AddressException ex) {
            Logger.getLogger(TestMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(TestMail.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {            
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
