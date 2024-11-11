public class Main {
    public static void main(String[] args) {
        SmartDevice[] sd = new SmartDevice[3];

        sd[0] = new Light("Light", 50);
        sd[1] = new Thermostat("Thermostat", 17.1);
        sd[2] = new SecurityCamera("Security Camera");

        SmartHomeController shc = new SmartHomeController();
        shc.controlAllDevices(sd);
    }
}