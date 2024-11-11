public class Light extends SmartDevice {
    int brightness;

    public Light(String deviceName, int brightness) {
        super(deviceName);
        this.brightness = brightness;
    }

    public void adjustBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println(deviceName + " brightness level is " + brightness );
        } else {
            System.out.println("Brightness level between 0 - 100");
        }
    }

    @Override
    public void status() {
        if (isOn) {
            System.out.println(deviceName + " is ON and brightness is " + brightness);
        } else {
            System.out.println(deviceName + " is OFF and brightness is " + brightness);
        }

    }
}
