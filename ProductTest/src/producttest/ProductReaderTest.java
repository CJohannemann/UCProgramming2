package producttest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class ProductReaderTest {

    public static void main(String[] args) throws FileNotFoundException {

        JFileChooser chooser = new JFileChooser("C:\\UC Java Programming 2");
        chooser.showOpenDialog(null);
        File fileName = chooser.getSelectedFile();
        ArrayList<Product> peep = new ArrayList<>();
        Scanner sc = new Scanner(fileName);

        while (sc.hasNextLine()) {
            String[] inputs = sc.nextLine().split(",");
            peep.add(new Product(inputs[0], inputs[1], inputs[2], Double.parseDouble(inputs[3])));
            int counter = 0;
            for (String input : inputs) {
                if (counter <= 5) {
                    System.out.print(input);
                    counter++;
                    if (counter == 5) {
                        counter = 0;
                    }
                }
            }
            System.out.println("");
        }
    }
}
