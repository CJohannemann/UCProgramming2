package inheritance;

public class SalaryWorker extends Worker{

    private double annualSalary;
    
    SalaryWorker(){
        
    }
    SalaryWorker(String title, String firstName, String lastName, String id, int yob, int salary){
        super(title, firstName, lastName, id, yob, 0);
        this.annualSalary = salary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
        
        
    }
    
    @Override
    public String displayWeeklyPay(double annualSalary){
        String s = "";
        s += this.toString();
        double weeklySal = 0;
        weeklySal= this.annualSalary / 52;
        s += weeklySal;
        return s;
    }
}
