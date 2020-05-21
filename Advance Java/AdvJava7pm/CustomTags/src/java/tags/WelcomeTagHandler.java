package tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WelcomeTagHandler extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
                out.println("<center>");
                out.println("<h1>ABCD Internationals</h1>");
                out.println("<h3>114-A,New palasia,Indore</h3>");
                out.println("<h5>Mob : 9988776655-44-33-22</h5><hr>");
                out.println("</center>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in WelcomeTagHandler tag", ex);
        }
    }
}
