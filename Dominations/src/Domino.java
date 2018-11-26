public class Domino {

    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Domino(int number) {
        this.number = number;
    }

    private int size = 2;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private Ground ground1;

    public Ground getGround1() {
        return ground1;
    }

    public void setGround1(Ground ground1) {
        this.ground1 = ground1;
    }

    public Ground getGround2() {
        return ground2;
    }

    public void setGround2(Ground ground2) {
        this.ground2 = ground2;
    }

    public Domino(Ground ground1, Ground ground2) {
        this.ground1 = ground1;
        this.ground2 = ground2;
    }

    private Ground ground2;







}
