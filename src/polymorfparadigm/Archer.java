package polymorfparadigm;


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

    @Override
    public String getInfo() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", damagePoint=" + damagePoint +
                ", skin=" + skin +
                ", countArrows=" + countArrows +
                '}';
    }
}
