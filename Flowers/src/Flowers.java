public class Flowers {
    private String name;
    private String color;
    private String fresh;
    private int price;
    private int height;

    public Flowers(String name, String color, String fresh, int price, int height) {
        this.name = name;
        this.color = color;
        this.fresh = fresh;
        this.price = price;
        this.height = height;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColor(){
        return this.color;
    }

    public String getName(){
        return this.name;
    }

    public String getFresh(){
        return  this.fresh;
    }

    public int getHeight(){
        return this.height;
    }

}
