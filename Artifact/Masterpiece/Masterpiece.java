package Artifact.Masterpiece;
import Artifact.*;

public class Masterpiece extends Artifact {
    protected String movement;
    protected String condition;

    public Masterpiece(int i, String cr, int y, String move, String cond) {
        super(i, cr, y);
        System.out.println("Creating an instance of Masterpiece");
        movement = move;
        condition = cond;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("Movement: " + movement + "\n");
        System.out.println("Condition: " + condition + "\n");
    }
    public boolean evaluate(String reuma) {
        System.out.println("in masterpice's evaluate with one argument\n");
        return true;
    }
    public boolean evaluate(String reuma, String katastash) {
        System.out.println("in masterpice's evaluate with two arguments\n");
        return true;
    }
    public void setCondition(String new_condition) {
        condition = new_condition; // edw den mas enoxlei toso an den to kanw san praksh
    }
}