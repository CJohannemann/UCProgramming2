
package encapsulationtests;


public class Person {
    
    private String firstName;
    private String lastName;
    private String title;
    private String id;
    private int yob;
    
    
    public Person(){
        firstName = "";
        lastName = "";
        title = "";
        id = "";
        yob = 2000;                
    }
    
    public Person(String first, String last, String t, String i, int y){
        firstName = first;
        lastName = last;
        title = t;
        id = i;
        yob = y;
    }
    
    public String toString(){
        return firstName + " " + lastName + " " + title + " " + id + " " + yob;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the yob
     */
    public int getYob() {
        return yob;
    }
}
