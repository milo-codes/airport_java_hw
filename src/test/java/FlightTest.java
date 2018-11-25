import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void setup() {
        plane = new Plane("ScottishWings", PlaneType.AIRBUS320);
        flight = new Flight(plane, "SW12", "Inverness");
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("SW12", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("Inverness", flight.getDestination());
    }

}
