import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        User user1 = new User("US001");
        user1.setPassword("pass1");
        user1.setLogin_status(true);

        System.out.println("user id = " + user1.getUser_id());
        System.out.println("password = " + user1.getPassword());
        System.out.println("login status = " + user1.verify_login() );


        Customer customer1 = new Customer("CU001");
        customer1.register("CU001", "23623");
        customer1.setCustomer_name("Andre william");
        customer1.setAddress("jl oop no 1");
        customer1.setEmail("customer1@gmail.com");
        customer1.update_credit_card_info("44455667788", "2023-04-01", "65323");
        customer1.update_shipping_info(100000, 20000, 120000);

        System.out.println("\n\ncustomer name = " + customer1.getCustomer_name());
        System.out.println("user id = " + customer1.getUser_id());
        System.out.println("password = " + customer1.getPassword());
        System.out.println("login status = " + customer1.verify_login());
        System.out.println("address = " + customer1.getAddress());
        System.out.println("email = " + customer1.getEmail());
        System.out.println("Credit card info :");
        customer1.show_credit_card_info();
        System.out.println("Shipping info :");
        customer1.showshipping_info();
        System.out.println("\n\n");

        Admin admin1 = new Admin("AD001");
        admin1.setAdmin_name("Steven");
        admin1.setEmail("admin@gmail.com");
        admin1.setPassword("asdlhga");

        System.out.println("user id = " + admin1.getUser_id());
        System.out.println("password = " + admin1.getPassword());
        System.out.println("email = " + admin1.getEmail());
        System.out.println("login status = " + admin1.verify_login());
        System.out.println("admin name = " + admin1.getAdmin_name());

    }
}
