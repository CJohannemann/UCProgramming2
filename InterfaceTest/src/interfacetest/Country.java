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
public class Country implements Measurable{
    
    private double squareMiles;
    
    public Country(double sqm){
        this.squareMiles = sqm;
    }

    @Override
    public double getMeasure() {
        return squareMiles;
    }
    
}
