package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class InterfacesTest {

    public static void main(String[] args) throws FileNotFoundException{

        
        ShortWordFilter swf = new ShortWordFilter();
        JFileChooser chooser = new JFileChooser("C:");
        chooser.showOpenDialog(null);
    
        File fileName = chooser.getSelectedFile();
        Scanner sc = new Scanner(fileName);
        
        String[] guess = null;
        ArrayList<Object> array = new ArrayList<>();
        ArrayList<Object> results = new ArrayList<>();
        while (sc.hasNextLine()) {
            guess = sc.next().split(" ");
              for(String g : guess){
                  array.add(g);
                  results = CollectionHelper.collectAll(array, swf);
            }
        }
        for (Object s : results){
            System.out.println(s.toString());
        }
    }
}
