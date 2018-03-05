public class Main {
    public static void main(String[]args){
        long a = 0x1f;   //шіснацяткова
        System.out.println("a: " + Long.toBinaryString(a));
        long b = 0177;   //вісімкова
        System.out.println("b: " + Long.toBinaryString(b));
    }
}
