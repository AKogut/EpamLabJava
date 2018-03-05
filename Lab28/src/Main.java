public class Main {
    public static void main(String[]args){
        float mas [] = new float[100];
        for(int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            if (mas[i] % mas[i] == 0) {
                System.out.println(mas[i]);
            }
            else
                continue;
        }
    }
}
