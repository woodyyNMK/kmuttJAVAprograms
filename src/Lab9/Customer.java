
package Lab9;


public class Customer {
    private String fristname;
    private String lastname;
    private int customerId;

    public Customer(String fristname, String lastname, int customerId) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.customerId = customerId;
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    
}
