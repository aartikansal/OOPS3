public class Customer {
    //STATE
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //Customer contains reference to an instance of the object address
    //object composition

    //CREATING constructors
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;

    }

    //operations ---method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String toString() {
return String.format("name -[%s] home address- [%s] work address-[%s]",
        name,homeAddress, workAddress );
    }
}
