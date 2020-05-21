
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class CTXListener implements ServletContextListener {
    int visitor=0;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
            ServletContext ctx= sce.getServletContext();
            File f1=new File("count.txt");
            if(f1.exists()){
            FileInputStream fin=null;
            try {
                fin = new FileInputStream(f1);
                DataInputStream din=new DataInputStream(fin);
                visitor=din.readInt();
                din.close();
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(CTXListener.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fin.close();
                } catch (IOException ex) {
                    Logger.getLogger(CTXListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            }
            
            ctx.setAttribute("visitor", visitor);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      FileOutputStream fout=null;
        try {
            int n=(Integer)sce.getServletContext().getAttribute("visitor");
            fout = new FileOutputStream("count.txt");
            DataOutputStream dout=new DataOutputStream(fout);
            dout.writeInt(n);
            dout.close();
            fout.close();
        } catch (IOException ex) {
            Logger.getLogger(CTXListener.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(CTXListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
