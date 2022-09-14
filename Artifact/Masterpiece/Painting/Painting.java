package Artifact.Masterpiece.Painting;
import Artifact.Masterpiece.*;

public class Painting extends Masterpiece{
    double length;
    double width;
    String technique;

    public Painting(int i, String cr, int y, String move, String cond, double l, double w, String tech) {
        super(i, cr, y, move, cond);
        System.out.println("Creating an instance of Painting");
        length = l;
        width = w;
        technique = tech;
    }
    public void getInfo() {
        super.getInfo();
        double surface = length*width; // to orizw edw mesa kai oxi sthn klash ws antikeimeno giati den xrhsimopoieitai pou8ena allou
        System.out.println("Surface: " + surface + " dc^2 \n");
    }
    public boolean evaluate(String reuma) {
        return evaluate(reuma, "good");
    }
    public boolean evaluate(String reuma, String katastash) {
        if (movement.equals(reuma)) {
            if (condition.equals(katastash) || (katastash.equals("good") && condition.equals("excellent"))) {
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
