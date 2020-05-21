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
        int n=tbeans.getNettaxamt();
        String view="";
        if(n>0)
            view="heads";
        else
            view="tails";
        return mapping.findForward(view);
    }
}
