


//    Автоупаковка примітивних типів
public class Main {
    public static void main(String[]args){
        int sum = 0;
        for (int i = 0; i<10; i++ ) {
            if (i % 2 == 0) {
                sum += i;
                System.out.print(sum);
            }
        else
            continue;
        }
    }
}
