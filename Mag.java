package Unit;

public class Mag extends Shooter {
     protected String abilities;
    public Mag(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed, String abilities) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed);
        this.abilities=abilities;
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
