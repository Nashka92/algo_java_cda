package tp1;

public class Exo_4 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 0};
        boolean doublon = false;

/**
 * imbrication de boucle, parcours le tableau et compare les deux itérations
 * pour voir s'il y a un doublon ou non
 */
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    doublon = true;
                }
                else doublon = false;
            }

        }

        if (doublon) {
            System.out.println("Ce tableau contient un doublon");
        } else {
            System.out.println("Aucun doublon trouvé dans le tableau");
        }
    }
}



