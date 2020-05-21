package tax;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class TaxBeans extends org.apache.struts.action.ActionForm {
    int income,age,deduction,taxamt,rebate,nettaxamt;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        taxCalc();
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
        taxCalc();
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
        taxCalc();
    }

    public int getNettaxamt() {
        return nettaxamt;
    }

    public void setNettaxamt(int nettaxamt) {
        this.nettaxamt = nettaxamt;
    }

    public int getRebate() {
        return rebate;
    }

    public void setRebate(int rebate) {
        this.rebate = rebate;
    }

    public int getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(int taxamt) {
        this.taxamt = taxamt;
    }
 
    void taxCalc(){
    if(income>=1000000)
        taxamt=(income-deduction)*40/100;
    else if(income>=500000)
        taxamt=(income-deduction)*20/100;
    else if(income>=300000)
        taxamt=(income-deduction)*10/100;
    else if(income>=200000)
        taxamt=(income-deduction)*5/100;
    else
        taxamt=0;
    
    if(age>=60)
        rebate=taxamt*10/100;
    nettaxamt=taxamt-rebate;
}
    
    public TaxBeans() {
        super();
   }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }
}
