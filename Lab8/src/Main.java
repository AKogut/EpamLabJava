public class Main {
    public static void main(String[]args){
        System.out.println("Static.i= " + Static.i);
        Static st1 = new Static();
        Static st2 = new Static();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 3;
        System.out.println("After st1.i = 3, ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Create another Static, st3.");
        Static st3 = new Static();
        System.out.println("st3.i = " + st3.i);
    }
}
