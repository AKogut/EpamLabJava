public class Main {
    public static void main (String[]args){
        DataOnly variables = new DataOnly();
        variables.a = 200;
        variables.flo = 25.6f;
        variables.bool = true;
        System.out.println(variables.a);
        System.out.println(variables.flo);
        System.out.println(variables.bool);
    }
}
