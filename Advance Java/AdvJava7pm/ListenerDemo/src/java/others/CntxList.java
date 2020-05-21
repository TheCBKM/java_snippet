/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 * @author LABOPAL01
 */
public class CntxList implements ServletContextListener {
Connection con;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stds", "root","root");
            ServletContext ctx=sce.getServletContext();
            ctx.setAttribute("mycon", con);
        } catch (SQLException ex) {
            Logger.getLogger(CntxList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CntxList.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CntxList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
