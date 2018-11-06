package persongenerator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class PersonGenerator {

    public static void main(String[] args) throws IOException {
        Scanner replay = new Scanner(System.in);
        String answer = "y";
        boolean bingo = true;
        ArrayList<String> arrayID = new ArrayList<>();
        ArrayList<String> arrayFirstName = new ArrayList<>();
        ArrayList<String> arrayLastName = new ArrayList<>();
        ArrayList<String> arrayTitle = new ArrayList<>();
        ArrayList<Double> arrayYOB = new ArrayList<>();

        while (bingo) {
            getID(arrayID);
            getFirstName(arrayFirstName);
            getLastName(arrayLastName);
            getTitle(arrayTitle);
            getYOB(arrayYOB);
            System.out.println("Do you want to create another person? y/n");
            if (replay.hasNext()) {
                answer = replay.nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    bingo = true;
                } else {
                    bingo = false;
                    System.out.println("N");
                }
                if (!answer.equalsIgnoreCase("Y") || !answer.equalsIgnoreCase("N")) {
                    System.out.println("Please select Y or N");
                }
            }
        }
        String outputFileName = "C:\\Development\\GAWorkspace\\PersonGenerator\\PersonTestData.txt";
        PrintWriter out = new PrintWriter(outputFileName);;

        for (int arrayLength = 1; arrayLength < arrayID.size(); arrayLength++) {
            for (int i = 0; i < arrayID.size(); i++) {
                out.println(arrayID.get(i) + ", " + arrayFirstName.get(i) + ", " + arrayLastName.get(i) + ", " + arrayYOB.get(i));
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
        System.out.println("Please enter their first name");
        String fn = in.nextLine();
        arrayFirstName.add(fn);
        return arrayFirstName;
    }

    public static List getLastName(List<String> arrayLastName) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter their last name");
        String ln = in.nextLine();
        arrayLastName.add(ln);
        return arrayLastName;
    }
    
        public static List getTitle(List<String> arrayTitle) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter their title");
        String ln = in.nextLine();
        arrayTitle.add(ln);
        return arrayTitle;
    }

    public static List getYOB(List<Double> yob) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter their YOB");
        if (in.hasNextDouble()) {
            double cost = in.nextDouble();
            yob.add(cost);
        }
        return yob;
    }
}
