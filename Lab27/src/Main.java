public class Main {
    public static void main(String[]args){
        int a = 0x1010 | 0x111;
        int b = 0x1010 & 0x111;
        int c = 0x1010 ^ 0x111;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }
}
