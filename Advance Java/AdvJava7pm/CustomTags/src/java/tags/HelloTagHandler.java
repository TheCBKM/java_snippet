/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author LABOPAL01
 */
public class HelloTagHandler extends SimpleTagSupport {
        String name,place="Mumbai";

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
         out.println("Welcome "+name+" to "+place+"<br>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in HelloTagHandler tag", ex);
        }
    }
}
