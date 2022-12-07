package Maps;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private  final int locationId;
    private  final String Descrition;
    private final Map<Integer,String> exits;

    public Location(int locationId, String descrition) {
        this.locationId = locationId;
        Descrition = descrition;
        exits = new HashMap<>();
    }
    public void addExist(int locationId ,String direction){
        exits.put(locationId,direction);
    }



    public int getLocationId() {
        return locationId;
    }

    public String getDescrition() {
        return Descrition;
    }

    public Map< Integer,String> getExits() {
        return new HashMap<Integer,String>(exits);
    }
}
