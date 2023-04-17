package Unit;

public class StrelMan extends Crossbowman{

    public StrelMan(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed,
            int lotCrossbo, int arrows, int accuracy) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed, lotCrossbo, arrows, accuracy);
        
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
