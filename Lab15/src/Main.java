import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random rand = new Random();
        int a = rand.nextInt(2);
        if(a==0)
            System.out.println(a + " false");
        else
            System.out.println(a + " true");
    }
}
