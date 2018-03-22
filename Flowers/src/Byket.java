import java.util.ArrayList;
import java.util.List;

public class Byket {
    List<Flowers> flowersList = new ArrayList<>();

    public void add(Flowers flowers){
        flowersList.add(flowers);
    }

    public int getTotalPrice(){

    int totalPrice = 0;
        for (int i = 0; i< flowersList.size(); i++) {
            totalPrice += flowersList.get(i).getPrice();
        }
        return totalPrice;
    }

    public ArrayList searchByColor(String flowerColor){
        ArrayList<String> searchColor = new ArrayList<>();

        for (int i = 0; i <flowersList.size();i++){
            if (flowersList.get(i).getColor().compareTo(flowerColor) ==0){
                searchColor.add(flowersList.get(i).getName());
            }
        }
        return searchColor;
    }

    public ArrayList searchByFresh(String flowerFresh){
        ArrayList<String> searchFresh = new ArrayList<>();
        for (int i = 0; i <flowersList.size();i++){
            if (flowersList.get(i).getFresh().compareTo(flowerFresh) ==0){
                searchFresh.add(flowersList.get(i).getName());
            }
        }
        return searchFresh;
    }

}
