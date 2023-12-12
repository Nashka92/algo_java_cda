package tp2;

public class Main {
    public static void main(String[] args){
        Thermometre thermometreDeCorinne = new Thermometre();
        Thermometre autreThermometreDeCorinne = new Thermometre(12);

        System.out.println("le thermo affiche: " +thermometreDeCorinne.getFahrenheit());
        System.out.println("le thermo affiche: " +thermometreDeCorinne.getCelsius());
    }
}
