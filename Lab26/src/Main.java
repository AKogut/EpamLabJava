import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        long l = scanner.nextLong();
        System.out.println("Number = " + l);
        System.out.println("Binary is " + Long.toBinaryString(l));
        System.out.println("Number of one bits = " + Long.bitCount(l));
    }
}
