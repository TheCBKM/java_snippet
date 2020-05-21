package tax;

public class TaxBeans {
int income,age,deduction,taxamt,rebate,nettaxamt;

    public int getAge() {
        return age;
    }

    public int getDeduction() {
        return deduction;
    }

    public int getIncome() {
        return income;
    }

    public int getNettaxamt() {
        return nettaxamt;
    }

    public int getRebate() {
        return rebate;
    }

    public int getTaxamt() {
        return taxamt;
    }

    public void setAge(int age) {
        this.age = age;
        taxCalc();
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
        taxCalc();
    }

    public void setIncome(int income) {
        this.income = income;
        taxCalc();
    }

    void taxCalc(){
    income=income-deduction;
    if(income>=100000)
        taxamt=income*40/100;
    else if(income>=500000)
        taxamt=income*20/100;
    else if(income>=300000)
        taxamt=income*10/100;
    else if(income>=200000)
        taxamt=income*5/100;
    else 
        taxamt=0;
    
    if(age>=60)
        rebate=taxamt*10/100;
    
    nettaxamt=taxamt-rebate;
        
    }
}
