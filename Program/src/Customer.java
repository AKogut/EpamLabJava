import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private Rental _rental;

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name, Rental rental) {
        _name = name;
        _rental = rental;
        _rentals.add(_rental);
    }

    public String getName() {
        return _name;
    }

    public double getTotalCharge(){
        double result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }


    public String statement() {

        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalFrequentRenterPoints(){

        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){

            Rental each = (Rental) rentals.nextElement();
            result += _rental.getMovie().getFrequentRenterPoints(_rental.getDaysRented());
        }
        return  result;
    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "<H1>Rental for <EM>" + getName() + "</EM></H1><P>\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }

        result += "You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
        return result;
    } //+


}
