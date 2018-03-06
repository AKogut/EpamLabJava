public class Main {
    public static void main (String [] args){
        int number1 = 0x01010001;
        int number2 = (number1 < 10)? number1 : -number1;

        System.out.println(Integer.toBinaryString(number2));
    }
}
