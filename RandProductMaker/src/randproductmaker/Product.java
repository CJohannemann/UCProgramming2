/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randproductmaker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author cjohannemann
 */
public class Product {
    private String name;
    private String description;
    private String id;
    private double cost;
    

    public Product(String fullname, String desc, String idNum, double amount){
        name = fullname;
        description = desc;
        id = idNum;
        cost = amount;
    }

    Product() {
        
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }
    public String toCSVDataRecord(){
     String csv = id + ", " + name + ", " + description + ", " + cost ;
        return csv;
    }
    public void toRandAccessFile(String name, String description, String id, double cost) throws FileNotFoundException, IOException{
        String data = name + " " + description + " " + id + " " + cost;
        RandomAccessFile rf = new RandomAccessFile("homework.dat", "rw");
        rf.writeChars(data);
        rf.close();
    }
    
}
