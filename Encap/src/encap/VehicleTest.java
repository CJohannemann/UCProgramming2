/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap;

import java.util.ArrayList;

/** 
 *
 * @author cjohannemann
 */
public class VehicleTest {

    public static void main(String[] args) {

        ArrayList<Seats> arr = new ArrayList();
        arr.add(new Plane(128));
        arr.add(new Boat(3));
 
    for(Seats s : arr){
        System.out.println(s.getSeats());
    }
    
    }

}
