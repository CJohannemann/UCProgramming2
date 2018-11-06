package inheritance;

public class Worker extends Person {

    private double hourlyPayRate;

    Worker() {

    }

    Worker(String title, String firstName, String lastName, String id, int yob, double hourlyRate) {
        super(title, firstName, lastName, id, yob);
        this.hourlyPayRate = hourlyRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = 0;
        if(hoursWorked <= 40){
        weeklyPay = hoursWorked * this.hourlyPayRate;
        }else{
            double overtime = 0;
            overtime = hoursWorked - 40;
            overtime = overtime * (this.hourlyPayRate * 1.5);
        }
        return weeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        String s = "";
       // s += this.toString();
        //display hours to 40 and total
        if(hoursWorked <=40){
        s += hoursWorked;
        }
        //display hours over 40 and total
        if(hoursWorked >40){
            double extraHours = 0;
            double num = 0;
            extraHours = hoursWorked - 40;
            num= extraHours + hoursWorked;
            s += num;
        }
        //double weeklyPay = 0;
        if(hoursWorked <= 40){
            double num = 0;
        num= (hoursWorked * this.hourlyPayRate);
        s += num;
        }else{
            double overtime = 0;
            double num = 0;
            overtime = (hoursWorked - 40);
            num= (overtime * (this.hourlyPayRate * 1.5));
            s +=num;
        }
        System.out.println(s);
        return s;
    }
    
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " " + displayWeeklyPay(hourlyPayRate);
    }

}
