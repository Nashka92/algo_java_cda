package tp2;

public class Thermometre {
    private double celsius;
    public Thermometre(double c){
        this.celsius = celsius;
    };
    public Thermometre(){
        this(0);
    };

    //getter et setter
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double temperature) {
        this.celsius = temperature;
    }
    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }
    public void setFahrenheit(double temperature) {
        this.celsius = (temperature - 32) / 1.8;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }

    public void setKelvin(double temperature) {
        this.celsius = temperature - 273.15;
    }

}
