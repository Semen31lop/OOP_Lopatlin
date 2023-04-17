package Unit;

public class Shooter extends BaseUnit{

    public Shooter(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed);
        
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
