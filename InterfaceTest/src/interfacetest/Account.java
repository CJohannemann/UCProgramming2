/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;

/**
 *
 * @author cjohannemann
 */
public class Account implements Measurable{

    private double balance;
    
    public Account(double money){
        this.balance = money;
    }
    
    
    @Override
    public double getMeasure() {
        return balance;
    }
    
}
