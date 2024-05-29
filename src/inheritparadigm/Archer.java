package inheritparadigm;


public class Archer extends Unit {

    private int countArrows;

    public Archer(String name, int healthPoint, int damagePoint, char skin, int countArrows) {

        super(name, healthPoint, damagePoint, skin);

        this.countArrows = countArrows;
    }

    public int getCountArrows() {
        return countArrows;
    }

    public void setCountArrows(int countArrows) {
        this.countArrows = countArrows;
    }
}
