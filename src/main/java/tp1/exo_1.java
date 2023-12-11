package tp1;

public class exo_1 {
    public static void main(String[] args) {
        int[] tabNote = new int[3];
        tabNote[0] = 10;
        tabNote[1] = 8;
        tabNote[2] = 15;

        int resultat = 0;

        for (int i = 0; i < tabNote.length; i++) {
            resultat += tabNote[i];
        }

        int moy = resultat / tabNote.length;

        System.out.println("La moyenne est de: " + moy);
    }
}

