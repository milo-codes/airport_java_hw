import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private String airportCode;

    public Airport(String airportCode) {
        this.hangar = new ArrayList<>();
        this.airportCode = airportCode;
    }

}
