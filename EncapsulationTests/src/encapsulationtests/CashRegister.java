
package encapsulationtests;

import java.util.ArrayList;


public class CashRegister {
    ArrayList<Item> items;
    private int itemCount;
    private double totalPrice;

    public CashRegister(){
        items = new ArrayList<>();
        itemCount = 0;
        totalPrice = 0;
    }
   
    public int getItemCount() {
     //   return itemCount;
     return items.size();
    }
     
    public double getTotalPrice() {
        return totalPrice;
    }      
    
    public void addItem(double price){
        totalPrice += price;
        itemCount++;
    }
    public void clear(){
        totalPrice = 0;
        itemCount = 0;
    }
}
