import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        System.out.print("Enter text: ");
        str1 = scan.nextLine();
        System.out.print("Enter text: ");
        str2 = scan.nextLine();

        if (str1.equals(str2)){
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}










