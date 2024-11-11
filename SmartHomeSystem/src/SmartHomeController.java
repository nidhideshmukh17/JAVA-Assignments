public class SmartHomeController {
    public void controlAllDevices(SmartDevice[] devices) {
        for (SmartDevice device : devices) {
            device.turnOn();

            if (device instanceof Light) {
                ((Light) device).adjustBrightness(50);
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(13.5);
            }

            device.status();
        }
    }
}
