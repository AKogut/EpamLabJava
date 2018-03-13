public class Main {
    public static void main (String[]args){
        // Static без конструктора
        StringClass.str1 = "Hello World";
        System.out.println(StringClass.str1);

        //З конструктором
        StringClass string_class = new StringClass();
        string_class.str2 = "Hello World 2.0";
        System.out.println(string_class.str2);
    }
}
