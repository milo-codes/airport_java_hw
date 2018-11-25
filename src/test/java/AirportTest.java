import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Hangar hangar;
    Plane plane;

    @Before
    public void setup() {
        airport = new Airport("EDI");
        hangar = new Hangar();
        plane = new Plane("ScottishWings", PlaneType.AIRBUS330);
    }

    @Test
    public void canGetHangarList() {
        assertEquals(0, airport.getHangarList().size());
    }

    @Test
    public void canGetAirportCode() {
        assertEquals("EDI", airport.getAirportCode());
    }

   

}
