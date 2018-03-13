import java.util.Scanner;

public class Main {
    public static String str;
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        str = scanner.next();
        Constructor constructor  = new Constructor();
        constructor.setName(str);
    }
}
