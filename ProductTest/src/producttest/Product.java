package producttest;

public class Product {
    private String name;
    private String desciption;
    private String id;
    private double cost;
    

    public Product(String fullname, String desc, String idNum, double amount){
        name = fullname;
        desciption = desc;
        id = idNum;
        cost = amount;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }
    public String toCSVDataRecord(){
     String csv = id + ", " + name + ", " + desciption + ", " + cost ;
        return csv;
    }
}
