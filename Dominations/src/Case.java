public class Case {
    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Case(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean occupied;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size = 2;


}
