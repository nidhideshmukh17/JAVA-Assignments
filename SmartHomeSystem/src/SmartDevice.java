public class SmartDevice {
    String deviceName;
    boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " turned OFF.");
    }

    public void status() {
        if (isOn) {
            System.out.println(deviceName + " is ON");
        } else {
            System.out.println(deviceName + " is OFF");
        }
    }
}
