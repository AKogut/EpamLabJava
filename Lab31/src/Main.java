public class Main {
    public static void main(String[]args){
        symbol('a');
    }

    static void symbol(char symbol){
        System.out.println(Integer.toBinaryString(symbol));
    }
}
