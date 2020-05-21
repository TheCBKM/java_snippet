/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author LABOPAL01
 */
public class ProTagHandler extends SimpleTagSupport {
    private String pid;

    /**
     * Called by the container to invoke this tag. 
     * The implementation of this method is provided by the tag library developer,
     * and handles all tag processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora","eshops","eshops");
         PreparedStatement ps=con.prepareStatement("select * from products where pid=?");
         ps.setString(1, pid);
         ResultSet rs=ps.executeQuery();
         rs.next();
         out.println("<table border=5 width=4 cellspacing=4 cellpadding=3>");
    out.println("<thead>");
        out.println("<tr>");
            out.println("<th>Product Name</th>");
            out.println("<th>Description</th>");
            out.println("<th>Price</th>");
            out.println("<th>Disc(%)</th>");            
        out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody>");
        out.println("<tr>");
            out.println("<td>"+rs.getString(2) +"</td>");
            out.println("<td>"+rs.getString(3) +"</td>");
            out.println("<td>"+rs.getString(4) +"</td>");
            out.println("<td>"+rs.getString(5) +"</td>");
        out.println("</tr>");
out.println("    </tbody>");
out.println("</table>");

        } catch (IOException ex) {
            Logger.getLogger(ProTagHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProTagHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProTagHandler.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
