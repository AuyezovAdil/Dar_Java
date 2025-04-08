package OOP;

public class Temperature {
    private double temperature;
    private char system;

    public Temperature(double temperature) {
        this.temperature = 0;

    }

    public Temperature(char system) {
        this.system ='C';
    }

    public Temperature(double temperature, char system) {
        this.temperature = temperature;
        this.system = system;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setSystem(char system) {
        this.system = system;
    }

    public void setBoth (double temperature, char system) {
        this.system = system;
        this.temperature = temperature;
    }

    public double getCelsius() {
        double degreesF = temperature;

        if (system == 'F') {
            temperature = 5 * (degreesF-32)/9;
        }
        return temperature;
    }

    public double getFarenheit() {
        double degreesC = temperature;

        if (system == 'C') {
            temperature = (9*(degreesC/5)) + 32;
        }
        return temperature;
    }
    public static void main(String[] args) {
    Temperature temperature = new Temperature(45, 'C');
    System.out.println(temperature.getFarenheit());
    }




}
