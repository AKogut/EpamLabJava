public class Main {
    public static void main(String[]args){
        Dog spot = new Dog();
        Dog scraffy = new Dog();

        spot.name = "Camel";
        spot.says = "Hi";
        System.out.println(spot.name + spot.says);

        scraffy.name = "Locki";
        scraffy.says = "Gav";
        System.out.println(scraffy.name + scraffy.says);
    }
}
