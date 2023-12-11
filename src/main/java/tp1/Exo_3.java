package tp1;

public class Exo_3 {
    public static void main(String[] args) {
        int input = 641;
        // initialisation de la variable reverse
        int reverse = 0;
        // sauvegarde de la valeur originale pour la vérification
        int checkInput = input;

        while (input != 0) {
            int reste = input % 10;
            reverse = reverse * 10 + reste;
            input = input / 10;
        }

        System.out.println("l'inverse de nombre est: " + reverse);

        if (isPalindrome(checkInput )) {
            System.out.println("Ce nombre " + checkInput  + " est un palindrome");
        } else {
            System.out.println("Ce nombre " + checkInput  + " n'est pas un palindrome");
        }
    }

    // Création d'une méthode de type bool pour vérifier si ce résultat est un palindrome ou non
    public static boolean isPalindrome(int input) {
        int reverse = 0;
        int checkInput  = input;
        // sauvegarde de la valeur originale pour la vérification

        while (input != 0) {
            int reste = input % 10;
            reverse = reverse * 10 + reste;
            input = input / 10;
        }

        // Comparaison du nombre inversé avec la valeur originale
        return reverse == checkInput;
    }
}

