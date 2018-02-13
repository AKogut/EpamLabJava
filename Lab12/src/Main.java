public class Main {
    public static void main(String[]args){
        Float F = new Float();
        F.var = 76.65f;
        System.out.println("1: F.var: " + F.var);
        PassObject.f(F);
        System.out.println("2: F.var: " + F.var);
    }
}
