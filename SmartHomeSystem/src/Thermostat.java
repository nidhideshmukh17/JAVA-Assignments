public class Thermostat extends SmartDevice {
    double temperature;

    public Thermostat(String deviceName, double temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(deviceName + " temperature set to " + temperature + "°C.");
    }

    @Override
    public void status() {
        if (isOn) {
            System.out.println(deviceName + " is ON at " + temperature + "°C");
        } else {
            System.out.println(deviceName + " is OFF at " + temperature + "°C");
        }

    }
}
