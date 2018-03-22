import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Flowers flower1 = new Flowers("rose", "red", "fresh", 26, 50);
        Flowers flower2 = new Flowers("tylip", "blue", "nofresh", 20, 30);
        Flowers flower3 = new Flowers("chamomile", "white", "fresh", 13, 30);
        Flowers flower4 = new Flowers("rose", "white", "fresh", 30, 50);
        Flowers flower5 = new Flowers("tylip", "yellow", "nofresh", 15, 30);

        Byket byket = new Byket();
        byket.add(flower1);
        byket.add(flower2);
        byket.add(flower3);
        byket.add(flower4);
        byket.add(flower5);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter colors: ");
        String colorsFlowers = scanner.next();

        System.out.print("Enter fresh or nofresh: ");
        String freshFlowers = scanner.next();




        System.out.println("Price: " + byket.getTotalPrice() + " $");
        System.out.println("Search flowers by colors: " + byket.searchByColor(colorsFlowers));
        System.out.println("Search flowers by fresh: " + byket.searchByFresh(freshFlowers));

    }
}
