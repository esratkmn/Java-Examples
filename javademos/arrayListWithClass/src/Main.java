import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer esra=new Customer(1,"Esra","Tokman");
        customers.add(esra);
        //customers.add(new Customer (1,"Esra","Tokman"));
        customers.add(new Customer(2,"Songül","Tokman"));
        customers.add(new Customer(3,"Suna", "Tokman"));

        customers.remove(esra);
        for(Customer customer: customers){
            System.out.println(customer.firstName);
        }
    }
}
