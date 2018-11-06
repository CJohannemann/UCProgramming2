
package inheritance;


public class Person {
    
    private String firstName;
    private String lastName;
    private String id;
    private String title;
    private int yob;
    
 
    Person(){
    }
    
    Person(String title, String firstName, String lastName, String id, int yob){
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yob = yob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return id;
    }
    
    public void setID(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return yob;
    }

    public void setYOB(int yob) {
        this.yob = yob;
    }
    
    public String fullName(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public String formalName(){
        String formalName = title + " " + fullName();
        return formalName;
    }
    public int getAge(int yob){
        int age = 2018 - yob;
        return age;
    }
}
