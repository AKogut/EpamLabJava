import java.util.Scanner;

public class Main {

    public static String actions;

    public static void main(String [] args){
        System.out.println("Enter bark: ");
        Scanner scanner = new Scanner(System.in);
        actions = scanner.next();
        Dog dog = new Dog();
        dog.bark(actions);
    }
}
