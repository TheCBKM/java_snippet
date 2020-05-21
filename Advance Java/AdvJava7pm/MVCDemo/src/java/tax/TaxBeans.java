package tax;

public class TaxBeans {
int income,age,deduction,rebate,taxamt,nettaxamt;

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

    public int getRebate() {
        return rebate;
    }
    public int getTaxamt() {
        return taxamt;
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
}
