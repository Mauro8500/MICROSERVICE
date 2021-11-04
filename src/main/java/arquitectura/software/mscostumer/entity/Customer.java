package arquitectura.software.mscostumer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String name;
    private String lastName;
    private String email;

    public Customer(){

    }
    public Customer(Integer customerId, String name, String lastName, String email){
        this.customerId = customerId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getCustomerId() {
        return customerId;
    }
    public String getEmail() {
        return email;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return name;
    }
        public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Customer{"+
        "customerId=" + customerId + 
        ",name='" + name + '\'' +
        ",lastName'=" + lastName + '\'' +
        "email='" + email + '\'' +
        '}';
    }

}
