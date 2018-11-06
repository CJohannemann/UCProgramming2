package inheritance;

import java.util.*;

public class Inheritance {

    public static void main(String[] args) {

        ArrayList<Worker> arrayWorker = new ArrayList<>();

       // Person p = new Person();
        Worker w1 = new Worker("Mr", "Chris", "Johannemann", "1", 1986, 12.50);
        Worker w2 = new Worker("Mr", "Dyllon", "Dekok", "2", 1999, 22.20);
        Worker w3 = new Worker("Mrs", "Lauren", "Johannemann", "3", 1994, 15.35);
        SalaryWorker sw1 = new SalaryWorker("Mrs", "Jane", "Bracken", "4", 1963, 125000);
        SalaryWorker sw2 = new SalaryWorker("Mr", "Jim", "Niehaus", "5", 1957, 200000);
        SalaryWorker sw3 = new SalaryWorker("Mr", "Ronald", "McDonald", "6", 1919, 50000);

        arrayWorker.add(w1);
        arrayWorker.add(w2);
        arrayWorker.add(w3);
        arrayWorker.add(sw1);
        arrayWorker.add(sw2);
        arrayWorker.add(sw3);

        for(Worker p : arrayWorker){
            if(p.getHourlyPayRate() > 0){
            p.displayWeeklyPay(40);
            System.out.println(p);
            }
        }
        for(Worker p : arrayWorker){
            if(p.getHourlyPayRate() > 0){
            p.displayWeeklyPay(50);
            System.out.println(p);
        }
        }
        for(Worker p : arrayWorker){
         if(p.getHourlyPayRate() > 0){
            p.displayWeeklyPay(40);
            System.out.println(p);
        }
        }
    }
}
