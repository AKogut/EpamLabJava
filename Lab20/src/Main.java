import java.util.Random;

public class Main {
    public static int num1;
    public static int num2;
    public static void main(String[]args){
        Random rand = new Random();
        num1 = rand.nextInt(25);
        num2 = rand.nextInt(25);
        if(num1 > num2)
            System.out.println(num1 + " > " + num2);
        else if (num1 < num2)
            System.out.println(num1 + " < " + num2);
        else
            System.out.println(num1 + " = " + num2);
    }
}
