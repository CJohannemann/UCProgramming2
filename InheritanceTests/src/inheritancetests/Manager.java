/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetests;

/**
 *
 * @author cjohannemann
 */
public class Manager extends Employee{
    
    private double salary;
    
    public Manager(){
        super();
        this.salary = 20000;
        
    }

    public Manager(double salary, String address, String email, String name) {
        super(address, email, name);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }
}
