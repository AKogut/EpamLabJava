import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Summer summer = new Summer();
        Winter winter = new Winter();

        String sum = "summer";
        String win = "winter";


        System.out.println("Choose summer or winter shoes: ");
        String typeShoes = scanner.next();



        // Summer
        if (typeShoes.equals(sum)){
            System.out.println("Enter size: ");
            int size = scanner.nextInt();
            if (size >= 38 && size <= 47) {
                System.out.println("Brands which have " + size + ":");
                summer.setSizeAdidas(size);
                summer.setSizeNike(size);
                summer.setSizeBalance(size);
            }
            else
                System.out.println("Invalid size");
        }



        // Winter
        else if (typeShoes.equals(win)){
            System.out.println("Enter size: ");
            int size = scanner.nextInt();
            if (size >= 36 && size <= 46) {
                System.out.println("Brands which have " + size + ":");
                winter.setSizeLova(size);
                winter.setSizeCat(size);
                winter.setSizeTim(size);
            }
            else
                System.out.println("Invalid size");

        }
        else
            System.out.println("Error");
    }
}
