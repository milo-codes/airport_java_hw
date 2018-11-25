import java.util.ArrayList;

public class Plane {

    private String airline;
    private PlaneType type;
    private ArrayList<Passenger> passengerList;

    public Plane(String airline, PlaneType type) {
        this.airline = airline;
        this.type = type;
        this.passengerList = new ArrayList<>();
    }

}
