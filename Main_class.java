import java.lang.Math;
import java.util.Random;
import Artifact.Masterpiece.*;
import Artifact.Masterpiece.Painting.*;
import Artifact.Masterpiece.Sculpture.*;

public class Main_class {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Masterpiece[] array =  new Masterpiece[N];
        String katastash = "";
        String reuma = args[1];

        if (args.length == 3) {
            katastash += args[2]; // pio efficient apo to na egrafa katastash = args[2] kai kanoun kai sthn sugkekrimenh periptwsh thn idia douleia
        }
        
        String movements[] = {"impressionism", "expressionism", "naturalism"};
        String conditions[] = {"bad", "good", "excellent"};
        String techniques[] = {"oil", "aquarelle", "tempera"};
        String materials[] = {"irone", "stone", "wood"};
        
        // an random==1 tote ftiaxnw painting, an random==0 ftiaxnw sculpture
        for (Integer i = 0; i < N; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(2);
            String creator = "Creator" + i.toString();
            if (randomInt == 1) {   // ta ebala *10 giati me to Math.random() bgainei double 0.(kati) kai egw proswpika 8elw na na einai megalutera oi times
                array[i] = new Painting(i, creator, random_year(), random_string(movements), random_string(conditions), Math.random()*10, Math.random()*10, random_string(techniques));
            }
            else {
                array[i] = new Sculpture(i, creator, random_year(), random_string(movements), random_string(conditions), Math.random()*10, random_string(materials));
            }
        }
        
        auction(array, reuma, katastash);

        return;
    }
    public static void auction(Masterpiece[] art, String reuma, String katastash) {
        for (int i = 0; i < art.length; i++) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            art[i].getIndex();
            art[i].getInfo();
            boolean outcome;
            if (katastash.equals("")) { // an dhladh den exei dw8ei timh gia thn katastash apo thn grammh entolwn, kalei thn evaluate me 1 orisma
                outcome = art[i].evaluate(reuma);
            }
            else {
                outcome = art[i].evaluate(reuma, katastash);
            }
            System.out.println("The outcome of the evaluate method for this masterpiece is: " + outcome + "\n");
        }

        return;
    }
    static public String random_string(String arr[]) { // pairnei orisma enan pinaka apo string kai epistrefei randomly ena string apo auta
        Random random = new Random();
        int randomInt = random.nextInt(arr.length);
        return arr[randomInt];
    }
    static public int random_year() { // tuxaia dialeksa autes tis xronologies
        int range = 2022 - 1200 + 1;
        return (int)(Math.random()*range) + 1200;
    }   
    
}