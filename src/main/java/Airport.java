import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangarList;
    private String airportCode;

    public Airport(String airportCode) {
        this.hangarList = new ArrayList<>();
        this.airportCode = airportCode;
    }

    public ArrayList<Hangar> getHangarList() {
        return this.hangarList;
    }

}
