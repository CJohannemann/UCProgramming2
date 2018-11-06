package productmodel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ProductModel {

    public static void main(String[] args) throws IOException {
        Scanner replay = new Scanner(System.in);
        String answer = "y";
        boolean bingo = true;
        ArrayList<String> arrayID = new ArrayList<>();
        ArrayList<String> arrayFirstName = new ArrayList<>();
        ArrayList<String> description = new ArrayList<>();
        ArrayList<Double> cost = new ArrayList<>();

        while (bingo) {
            getID(arrayID);
            getFirstName(arrayFirstName);
            getLastName(description);

            getCost(cost);
            System.out.println("Do you want to enter another item? y/n");
            if (replay.hasNext()) {
                answer = replay.nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    bingo = true;
                } else if(answer.equalsIgnoreCase("N")){
                    bingo = false;
                    System.out.println("");
                }
                else if (!answer.equalsIgnoreCase("Y") || !answer.equalsIgnoreCase("N")) {
                    System.out.println("Please select Y or N");
                }
            }
        }
        String outputFileName = "C:\\Development\\GAWorkspace\\ProductModel\\ProductModel.txt";
        PrintWriter out = new PrintWriter(outputFileName);;

        for (int arrayLength = 1; arrayLength < arrayID.size(); arrayLength++) {
            for (int i = 0; i < arrayID.size(); i++) {
                out.println(arrayID.get(i) + ", " + arrayFirstName.get(i) + ", " + description.get(i) + ", " + cost.get(i));
            }
        }
        out.close();
    }

    public static List getID(List<String> arrayID) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Id");
        String id = in.nextLine();
        arrayID.add(id);
        return arrayID;
    }

    public static List getFirstName(List<String> arrayFirstName) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter product name");
        String fn = in.nextLine();
        arrayFirstName.add(fn);
        return arrayFirstName;
    }

    public static List getLastName(List<String> description) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a description");
        String ln = in.nextLine();
        description.add(ln);
        return description;
    }

    public static List getCost(List<Double> arrayCost) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a cost");
        if (in.hasNextDouble()) {
            double cost = in.nextDouble();
            arrayCost.add(cost);
        }
        return arrayCost;
    }
}
