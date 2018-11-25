import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangarList;
    private String airportCode;
    private ArrayList<Flight> flightList;

    public Airport(String airportCode) {
        this.hangarList = new ArrayList<>();
        this.airportCode = airportCode;
    }

    public ArrayList<Hangar> getHangarList() {
        return this.hangarList;
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public Flight createFlight(Plane plane, String flightNumber, String destination) {
        Flight newFlight = new Flight(plane, flightNumber, destination);
        return newFlight;
    }


}
