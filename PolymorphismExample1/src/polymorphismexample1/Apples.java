
package polymorphismexample1;


public class Apples {
        
        public static void main(String[] args){
            
            Fatty bucky = new Fatty();
            Food fo = new Food();
            Food po = new Potpie();
            
            bucky.digest(fo);
            bucky.digest(po);
        }
    
}
