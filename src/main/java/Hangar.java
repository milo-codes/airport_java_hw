import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> planeList;

    public Hangar() {
        this.planeList = new ArrayList<>();
    }

    public ArrayList<Plane> getPlaneList() {
        return this.planeList;
    }

    public void addPlaneToHangar(Plane plane) {
        this.planeList.add(plane);
    }

    public Plane removePlaneFromHangar() {
        return this.planeList.remove(0);
    }
}
