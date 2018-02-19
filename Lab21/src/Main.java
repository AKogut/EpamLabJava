import java.util.Random;

public class Main {
    public static void main(String[]args) {
        while (true) {
            Float floatClass = new Float();
            Random rand = new Random();
            floatClass.var = rand.nextFloat();
            System.out.println("1: F.var: " + floatClass.var);
            PassObject.f(floatClass);
            System.out.println("2: F.var: " + floatClass.var);
            System.out.println("<------------------------------->");
        }
    }
}
