public enum PlaneType {
    BOEING737(162),
    AIRBUS320(186),
    BOEING747(524),
    BOEING777(442),
    AIRBUS330(335);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
