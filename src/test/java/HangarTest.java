import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;

    @Before
    public void setup() {
        hangar = new Hangar();
    }

    @Test
    public void canGetPlaneList( ){
        assertEquals(0, hangar.getPlaneList().size());
    }

}
