/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;

import java.util.ArrayList;

public class InterfaceTest {

    public static void main(String[] args) {
        Person p = new Person();
        
        p.setFirstName("Chris");
        p.setLastName("Johannemann");
        
        
        Person p1 = new Person();
        p1.setFirstName("Chris");
        p1.setLastName("Johannemann");
        
        int i = p.compareTo(p1);
        //Comparable c1 = p;
        System.out.println(i);
        
        
        ArrayList<Measurable> obj = new ArrayList<>();
        obj.add(new Country(50000));
        obj.add(new Account(8.11));
        
        for (Measurable m : obj){
            System.out.println(m.getMeasure());
        }
    }
}
