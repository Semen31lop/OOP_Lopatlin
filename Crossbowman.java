package Unit;

public class Crossbowman extends Shooter {
    protected int arrows;
    protected int accuracy;
    public Crossbowman(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed, int lotCrossbo,int arrows,int accuracy) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed);
        this.arrows=armor;
        this.accuracy=accuracy;
    }
   
    public String toString() {
        return name;
    }

    
    void healing(){

    }
    void protection(){

    }
    void attack(){

    }
}
