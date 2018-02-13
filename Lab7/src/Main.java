public class Main {
    public static void main(String[]args){
        System.out.println("staticTest.i= " + staticTest.i);
        staticTest st1 = new staticTest();
        staticTest st2 = new staticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After sf.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}
