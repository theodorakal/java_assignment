package Artifact;

public class Artifact {
    final int index;
    final String creator;
    final int year;
    
    public Artifact(int i, String cr, int y) {
        System.out.println("Creating an instance of Artifact");
        index = i;
        creator = cr;
        year = y;
    }
    public void getInfo() {
        System.out.println("Creator: " + creator + "\n");
        System.out.println("Year: " + year + "\n");
    }
    public void getIndex() {
        System.out.println("Index: " + index + "\n");
    }
}
