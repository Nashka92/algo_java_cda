package tp1;

public class Exo_3 {
    public static void main(String[] args) {
        int input = 657;
        int reverse = 0;

        while(input != 0){
            int reste = input % 10;
            reverse = reverse * 10 + reste;
            input = input / 10;
        };

        System.out.println("l'inverse de nombre est: " + reverse);
    };

}
