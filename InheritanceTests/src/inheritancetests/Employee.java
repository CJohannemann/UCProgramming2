
package inheritancetests;

public class Employee {
    private String employeeID;
    private String address;
    private String email;
    private String name;

    
    public Employee(){
        this.address = "";
        this.email = "";
        this.name = "";
    }

    public Employee(String address, String email, String name) {
        this.employeeID = "1";
        this.address = address;
        this.email = email;
        this.name = name;
    }
  
    public String getEmployeeID() {
        return employeeID;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
