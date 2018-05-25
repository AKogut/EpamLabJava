public class Movie {
    private Price _price;
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;

    public Movie(String title, int priceCode) {

        _title = title;
        setPriceCode(priceCode);

    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {

        switch (arg) {

            case Movie.REGULAR:
                _price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case Movie.CHILDREN:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }

    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented){
        if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return  2;
        return 1;
    }


}
