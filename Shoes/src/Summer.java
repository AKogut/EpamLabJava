public class Summer extends Shoes{

    public void setSizeAdidas(int size){
        for (int i = 0; i < sizeAdidas.length; i++) {
            if (sizeAdidas[i] == size) {
                System.out.println(adidas);
            } else
                continue;
        }
    }

    public void setSizeNike(int size){
        for (int i = 0; i < sizeNike.length; i++) {
            if (sizeNike[i] == size) {
                System.out.println(nike);
            } else
                continue;
        }
    }

    public void setSizeBalance(int size){
        for (int i = 0; i < sizeBalance.length; i++) {
            if (sizeBalance[i] == size) {
                System.out.println(newBalance);
            } else
                continue;
        }
    }

}
