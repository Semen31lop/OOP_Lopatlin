import Unit.Crossbowman;
import Unit.Mag;
import Unit.Monax;
import Unit.Shooter;
import Unit.Sniper;
import Unit.StrelMan;
import Unit.Vor;

public class Game {
    public static void main(String[] args) {
        Shooter shooter= new Shooter("Den", 0, 0, 0, 0, 0, 0, 0);
        Mag mag = new Mag("Sem", 0, 0, 0, 0, 0, 0, 0, null);
        Vor vor = new Vor("Hard", 0, 0, 0, 0, 0, 0, 0, null);
        StrelMan strelMan= new StrelMan("Din", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Sniper sniper = new Sniper("Miki");
        Monax monax =new Monax("Karl", 0, 0, 0, 0, 0, 0, 0, null);
        Crossbowman crossbowman = new Crossbowman("Lip", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(shooter);
        System.out.println(vor);

        //shooter,mag,vor,strelMan,sniper,monax;  а почему я не могу сразу все имена вывести ?

    }
}