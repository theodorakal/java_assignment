package Artifact.Masterpiece.Sculpture;
import Artifact.Masterpiece.*;

public class Sculpture extends Masterpiece {
    final double volume;
    final String material;

    public Sculpture(int i, String cr, int y, String move, String cond, double v, String m) {
        super(i, cr, y, move, cond);
        System.out.println("Creating an instance of Sculpture");
        volume = v;
        material = m;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("Volume: " + volume + " dc^3\n");
        System.out.println("Material: " + material + "\n");
    }
    public boolean evaluate(String reuma) {
        return evaluate(reuma, "excellent");
    }
    public boolean evaluate(String reuma, String katastash) {
        if (movement.equals(reuma)) {
            if (condition.equals(katastash)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
