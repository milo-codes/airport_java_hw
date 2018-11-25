import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;
    Plane plane;

    @Before
    public void setup() {
        hangar = new Hangar();
        plane = new Plane("ScottishWings", PlaneType.AIRBUS330);
    }

    @Test
    public void canGetPlaneList( ){
        assertEquals(0, hangar.getPlaneList().size());
    }

    @Test
    public void canAddPlaneToPlaneList() {
        hangar.addPlaneToHangar(plane);
        assertEquals(1, hangar.getPlaneList().size());
    }

    @Test
    public void canRemovePlaneFromPlaneList() {
        hangar.addPlaneToHangar(plane);
        hangar.removePlaneFromHangar();
        assertEquals(0, hangar.getPlaneList().size());
    }

}
