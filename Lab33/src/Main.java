public class Main {
    public static void main(String[]args){
        int number1 = 0x101010;
        int number2 = 0x010101;

        System.out.println(Integer.toBinaryString(number1 >>> number2));

        number1 >>= number1;
        System.out.println(Integer.toBinaryString(number1 >>> number2));

        number1 >>= number1;
        System.out.println(Integer.toBinaryString(number1 >>> number2));
    }
}
