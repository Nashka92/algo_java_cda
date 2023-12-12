package tp2;

public class Thermometre {
    private double celsius;
    public Thermometre(double celsius){
        this.celsius = celsius;
    };
    public Thermometre(){
        this(0);
    };

    //getter et setter
    public double getCelsius() {
        return this.celsius;
    }
    public void setCelsius(double NouvelleTemperatureEnCelsius) {
        this.celsius = NouvelleTemperatureEnCelsius;
    }
    public double getFahrenheit() {
        return this.celsius * 1.8 + 32;
    }
    public void setFahrenheit(double NouvelleTemperatureEnCelsius) {
        this.celsius = (NouvelleTemperatureEnCelsius - 32) / 1.8;
    }

    public double getKelvin() {
        return this.celsius + 273.15;
    }

    public void setKelvin(double NouvelleTemperatureEnCelsius) {
        this.celsius = NouvelleTemperatureEnCelsius - 273.15;
    }
}
