package producttest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Product> p = new ArrayList<>();
        Product product;
        boolean add = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter description: ");
            String desc = sc1.nextLine();
            
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter id: ");
            String id = sc2.next();
            
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter Price: ");
            Double cost = null;
            cost = sc3.nextDouble();

            product = new Product(name, desc, id, cost);
            p.add(product);
            Scanner prompt = new Scanner(System.in);
            add = SafeInput.getYNConfirm(prompt, "Do you want to enter a new person?");
        } while (add);
        String outputFileName = "C:\\Development\\UC Java Programming 2";
        File inputFile = new File(outputFileName);
        PrintWriter out = new PrintWriter(inputFile);
        for (int i = 0; i < p.size(); i++) {
            out.println(p.get(i).toCSVDataRecord());
        }
        out.close();
    }
}
