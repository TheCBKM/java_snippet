package tax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TaxAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        tax.TaxBeans tbeans=(tax.TaxBeans) form;
        String view="";
        int inc=tbeans.getIncome();
        int age=tbeans.getAge();
        if(inc<0 || age>100){
            if(inc<0)
                tbeans.setErrIncome("Income Must be greater than zero(0)");
            else
                tbeans.setErrIncome("");
            if(age>100)
                tbeans.setErrAge("invalid age.....");
            else
                tbeans.setErrAge("");
                
        view="err";
        }
        else{
            tbeans.setErrIncome("");
            tbeans.setErrAge("");
        int n=tbeans.getNettaxamt();
        if(n>0)
            view="heads";
        else
            view="tails";
        }
        return mapping.findForward(view);
    }
}
