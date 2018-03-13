public class Dog {
    private String gav = "Gav";
    private String gavv = "Gavv";
    private String gavvv = "Gavvv";
    public void bark(String actions){
        if (actions.equals(gav)){
            System.out.println(gav);
        }
        else if (actions.equals(gavv)){
            System.out.println(gavv);
        }
        else if (actions.equals(gavvv)){
            System.out.println(gavvv);
        }
        else
            System.out.println("Error");
    }
}
