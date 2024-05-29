package inheritparadigm;

public class Warrior extends Unit {

    private int armorPoint;

    public Warrior(String name, int healthPoint, int damagePoint, char skin, int armorPoint) {
        super(name, healthPoint, damagePoint, skin);

        this.armorPoint = armorPoint;
    }

    public int getArmorPoint() {
        return armorPoint;
    }

    public void setArmorPoint(int armorPoint) {
        this.armorPoint = armorPoint;
    }
}
