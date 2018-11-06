/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap;

/**
 *
 * @author cjohannemann
 */
public class Boat implements Seats{

    int seating;
    
    Boat(int seats){
        this.seating = seats;
    }
    
    @Override
    public int getSeats() {
        return seating;
    }
    
}
