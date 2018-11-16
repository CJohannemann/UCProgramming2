/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randproductsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author cjohannemann
 */
public class RandProductSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter a partial product name");
        Scanner sc = new Scanner(System.in);
        String result = null;
        if(sc.hasNext()){
            result = sc.nextLine();
        }
        String path = "C:\\Development\\GAWorkspace\\RandProductMaker\\homework.dat";
        File file = new File(path);
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        
    }
    
}
