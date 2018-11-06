package person;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGeneratorTest {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        Person p;
        boolean add = true;
        do {
            System.out.println("Enter the id:");
            String idNumber = sc.hasNext() ? sc.nextLine() : "";

            System.out.println("Enter the first name:");
            Scanner sc2 = new Scanner(System.in);
            String firstName = sc2.hasNext() ? sc2.nextLine() : "";

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter the last name:");
            String lastName = sc3.hasNext() ? sc3.nextLine() : "";

            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter the title:");
            String titles = sc4.hasNext() ? sc4.nextLine() : "";

            System.out.println("Enter the yob:");
            Scanner sc5 = new Scanner(System.in);
            int yob = 0;
            if (sc5.hasNextInt()) {
                yob = sc5.nextInt();
            }

            p = new Person(idNumber, firstName, lastName, titles, yob);
            people.add(p);
            Scanner prompt = new Scanner(System.in);
            add = SafeInput.getYNConfirm(prompt, "Do you want to enter a new person?");
        } while (add);
        String outputFileName = "C:\\Development\\GAWorkspace\\Person\\PersonGeneratorTest.txt";
        File inputFile = new File(outputFileName);
        PrintWriter out = new PrintWriter(inputFile);
        for (int i = 0; i < people.size(); i++) {
            out.print(people.get(i).getId() + ", ");
            out.print(people.get(i).getFirstName() + ", ");
            out.print(people.get(i).getLastName() + ", ");
            out.print(people.get(i).getTitle() + ", ");
            out.print(people.get(i).getYob());// Used to show the age difference + " -- You are " + p.getAge() + " years old.");
            out.println();           /* Using the other methods as stated to use all methods... 
              With the below, it throws off the array when reading so commenting out
            out.println(people.get(i).toCSVDataRecord());
            out.println("You can call me: "+people.get(i).formalName());
            out.println("I am "+people.get(i).getAge()+ " years old");
            out.println();
            */
        }
        out.close();
    }
}
