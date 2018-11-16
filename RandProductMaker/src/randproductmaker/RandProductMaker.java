package randproductmaker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandProductMaker {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*
        Your program should prompt the user for Product data, 
        pad the fields to the correct length and save them to a RandomAccess file.  
        Use your program to create the Product data file. Be careful to use the 
        exact same inputs that you did for Lab 01 so we can compare the file formats. 
         */
        String name = null;
        String desc = null;
        String id = null;
        double amount = 0;
        boolean add = true;
        do {
            fullname(name);
            description(desc);
            setID(id);
            price(amount);
            productAdder(name, desc, id, amount);
            Scanner prompt = new Scanner(System.in);
            add = SafeInput.getYNConfirm(prompt, "Do you want to enter a new product?");
        } while (add);
    }

    private static ArrayList productAdder(String name, String desc, String id, double amount) throws FileNotFoundException, IOException {
        ArrayList<Product> products = new ArrayList();
        products.add(new Product(name, desc, id, amount));
        Product p = new Product();
        p.toRandAccessFile(name, desc, id, amount);
        
        return products;
    }

    private static String fullname(String name) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String newName = null;
        if (sc.hasNextLine()) {
            name = sc.next();
            if (name.length() < 35) {
                StringBuilder sb = new StringBuilder(name);
                for (int i = 0; i < 35 - name.length(); i++) {
                    sb.append(" ");
                    newName = sb.toString();
                }
            }
        }
        return newName;
    }

    private static String description(String desc) {
        System.out.println("Enter Product Description");
        Scanner sc = new Scanner(System.in);
        String descName = null;
        if (sc.hasNextLine()) {
            desc = sc.next();
            if (desc.length() < 75) {
                StringBuilder sb = new StringBuilder(desc);
                for (int i = 0; i < 75 - desc.length(); i++) {
                    sb.append(" ");
                    descName = sb.toString();
                }
            }
        }
        return descName;
    }

    private static String setID(String id) {
        System.out.println("Enter your ID number");
        Scanner sc = new Scanner(System.in);
        String newID = null;
        if (sc.hasNextLine()) {
            id = sc.next();
            if (id.length() < 6) {
                StringBuilder sb = new StringBuilder(id);
                for (int i = 0; i < 6 - id.length(); i++) {
                    sb.append(" ");
                    newID = sb.toString();
                }
            }
        }
        return newID;
    }

    private static String price(double amount) {
        System.out.println("Enter the price");
        Scanner sc = new Scanner(System.in);
        String newID = null;
        if (sc.hasNextDouble()) {
            amount = sc.nextDouble();
        }
        return newID;
    }
}
