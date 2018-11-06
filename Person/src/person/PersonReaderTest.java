package person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PersonReaderTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        JFileChooser chooser = new JFileChooser("C:\\Development\\GAWorkspace\\Person");
        chooser.showOpenDialog(null);
        File fileName = chooser.getSelectedFile();
        ArrayList<Person> peep = new ArrayList<>();
        Scanner sc = new Scanner(fileName);
        int counter = 1;
        while (sc.hasNextLine()) {
            String[] inputs = sc.nextLine().split(",");
            peep.add(new Person(inputs[0], inputs[1], inputs[2], inputs[3], Integer.parseInt(inputs[4].replace(" ", ""))));
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
