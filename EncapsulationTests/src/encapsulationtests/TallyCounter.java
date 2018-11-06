/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationtests;

/**
 *
 * @author cjohannemann
 */
public class TallyCounter {
    
    private int total;
    
    public void click(){
        total++;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }
    
    public void clearCounter(){
        total = 0;
    }
}
