
package person;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;




public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String title;
    private int yob;
    
    public Person(String idNumber, String firstName, String lastName, String titles, int yearOfBirth){
        id = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        title = titles;
        yob = yearOfBirth;
    }
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }
    
    public int getYob() {
        return yob;
    }
    
    public String fullName() 
    {
        return this.firstName + " " + this.lastName;
    }
    
    public String formalName(){
        return this.title + " " + fullName();
    }
    
    public int getAge(){
        int age = 0;
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        age = year - this.yob;
        return age;
    }
    
    public String toCSVDataRecord(){
     String csv =
     id + ", " + firstName + ", " + lastName + ", " + title + ", " + yob;
        return csv;
    }
}