import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Instruments> instrumentsList = new ArrayList<>();

    public void add(Instruments instruments){
        instrumentsList.add(instruments);
    }

    public ArrayList searchByType(String instrumentsName){
        ArrayList<String> searchName = new ArrayList<>();

        for (int i = 0; i<instrumentsList.size(); i++){
            if (instrumentsList.get(i).getType().compareTo(instrumentsName) == 0) {
                searchName.add(instrumentsList.get(i).getName());
            }
        }
        return searchName;
    }

    public ArrayList searchByName(String instrumentsType){
        ArrayList<String> searchType = new ArrayList<>();

        for (int i = 0; i<instrumentsList.size(); i++){
            if (instrumentsList.get(i).getName().compareTo(instrumentsType) ==0) {
                searchType.add(instrumentsList.get(i).getType());
            }
        }
        return searchType;
    }
}
