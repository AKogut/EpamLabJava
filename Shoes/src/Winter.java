public class Winter extends Shoes{

    public void setSizeLova(int size){
        for (int i = 0; i < sizeLova.length; i++) {
            if (sizeLova[i] == size) {
                System.out.println(lova);
            } else
                continue;
        }
    }

    public void setSizeCat(int size){
        for (int i = 0; i < sizeCat.length; i++) {
            if (sizeCat[i] == size) {
                System.out.println(cat);
            } else
                continue;
        }
    }

    public void setSizeTim(int size){
        for (int i = 0; i < sizeTim.length; i++) {
            if (sizeTim[i] == size) {
                System.out.println(tim);
            } else
                continue;
        }
    }

}
