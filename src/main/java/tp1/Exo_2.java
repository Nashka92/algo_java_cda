package tp1;

public class Exo_2 {
    public static void main(String[] args) {
        float htc = 100;

        double tva = 0.20;
        double ttc = htc + (htc * tva);

        System.out.println("Le prix TTC est de : " + ttc);
    }
}

