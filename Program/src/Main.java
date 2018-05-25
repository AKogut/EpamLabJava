public class Main {

    public static void main(String[] args) {


        Movie movie1 = new Movie("Dedpyl", 0);
        Rental rental1 = new Rental(movie1,5);
        Customer customer1 = new Customer("Oleg", rental1);
        System.out.println(customer1.statement());
    }
}
