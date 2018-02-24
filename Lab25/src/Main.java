import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        genDig();

    }

    static void genDig(){
        for(int i = 10; i<100; i++){
            for(int j = 10; j<100; j++){
                int s = i*j;
                char b[] = (new Integer(s)).toString().toCharArray();
                Arrays.sort(b);
                String x = (new Integer(i).toString());
                String y = (new Integer(j).toString());
                String z = x + y;
                char p[] = z.toCharArray();
                Arrays.sort(p);

                if(Arrays.equals(b, p)) {
                    System.out.println(i+" * "+j+" = "+s);
                }

            }
        }
    }
}
