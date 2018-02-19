import java.util.Random;

public class Main {
    public static void main(String[]args){
        int mas []  = new int[1000];
        for (int i = 0;  ;i++){
            Random rand = new Random();
            mas[i] = rand.nextInt(100);
            System.out.println(mas[i]);
            if (mas[i] == 99){
                break;
            }
            else
                continue;
        }
    }
}
