public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line 1", "Hyderabad", "500035");
        Customer customer = new Customer("Aarti", homeAddress);
        Address workAddress = new Address("line 1", "Hyderabad", "500035");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);

    }
}