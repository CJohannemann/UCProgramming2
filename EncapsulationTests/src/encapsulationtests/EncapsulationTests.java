package encapsulationtests;

public class EncapsulationTests {

    public static void main(String[] args) {
       
        
        Person p = new Person();
        System.out.println(p.getYob());
        
        Person a = new Person ("Johannemann", "Chris", "Mr.", "1", 1986);
        System.out.println(a.toString());
        
        /*
        CashRegister register = new CashRegister();
        System.out.println(register.getTotalPrice());
        System.out.println(register.getItemCount());
        
        
          TallyCounter counter = new TallyCounter();
        TallyCounter counter2 = new TallyCounter();

        for (int i = 0; i < 20; i++) {
            counter.click();
        }
        for (int i = 0; i < 50; i++) {
            counter2.click();
        }
        
        System.out.println(counter.getTotal());
        System.out.println(counter2.getTotal());
        
        counter.clearCounter();
        counter2.clearCounter();
        
        System.out.println(counter.getTotal());
        System.out.println(counter2.getTotal());
         

        CashRegister register = new CashRegister();
        CashRegister register2 = new CashRegister();

        register.addItem(19.95);
        register.addItem(28.05);

        register2.addItem(40.00);

        System.out.println(register.getTotalPrice() + " ------------ " + register.getItemCount());
        System.out.println(register2.getTotalPrice() + " ------------ " + register2.getItemCount());
        */
        
        
        
    }
}
