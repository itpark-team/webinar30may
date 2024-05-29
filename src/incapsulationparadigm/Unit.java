package incapsulationparadigm;

public class Unit {
    private String name;
    private int healthPoint;
    private int damagePoint;
    private char skin;

    public Unit(String name, int healthPoint, int damagePoint, char skin) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.damagePoint = damagePoint;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public char getSkin() {
        return skin;
    }

    public void setSkin(char skin) {
        this.skin = skin;
    }

    public void attackOtherUnit(Unit enemyUnit) {
        enemyUnit.healthPoint -= this.damagePoint;
    }
}
