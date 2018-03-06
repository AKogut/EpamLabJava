public class Main {
    public static void main(String[]args){

        int num1 = 0x101010;
        int num2 = 0x010101;

        System.out.println(Integer.toBinaryString(num1 >>> num2));
        System.out.println(Integer.toBinaryString(num1 << num2));
        System.out.println(Integer.toBinaryString(num1 >> num2));
    }
}
