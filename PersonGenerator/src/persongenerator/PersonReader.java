package persongenerator;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author cjohannemann
 */
public class PersonReader {

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        JFileChooser chooser = new JFileChooser("c:\\Development\\GAWorkspace\\PersonGenerator\\PersonTestData.txt");

        frame.add(chooser);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        chooser.showOpenDialog(null);
        frame.pack();

        File fileName = chooser.getSelectedFile();
        Desktop.getDesktop().open(fileName);

        try {
            String id = "ID#";
            String fn = "Firstname";
            String ln = "Lastname";
            String title = "Title";
            String year = "YOB";
            String bar = "===========================================";

            Scanner sc = new Scanner(fileName);
            List<String> temps = new ArrayList<String>();
            String value = "";
            while (sc.hasNext()) {
                value = sc.next();
                temps.add(value);
            }
            sc.close();
            String[] tokenArray = temps.toArray(new String[0]);
            System.out.print(String.format("%-5s %-10s %-12s %-8s %-5s%n", id, fn, ln, title, year));
            System.out.println(bar);
            int counter = 0;
            for (String s : tokenArray) {
                while (!s.isEmpty()) {
                    Arrays.toString(s.split(" "));
                    System.out.printf("%-9s", s.replace("[", ""));
                    if (counter == 4) {
                        System.out.println("");;
                    }
                    counter++;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }

    }
}
