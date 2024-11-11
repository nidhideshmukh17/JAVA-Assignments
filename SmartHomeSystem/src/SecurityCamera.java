public class SecurityCamera extends SmartDevice {
    boolean recording;

    public SecurityCamera(String deviceName) {
        super(deviceName);
        this.recording = false;
    }

    public void startRecording() {
        recording = true;
        System.out.println(deviceName + " recording start");
    }

    public void stopRecording() {
        recording = false;
        System.out.println(deviceName + " recording stop");
    }

    @Override
    public void status() {
        if (isOn) {
            if (recording) {
                System.out.println(deviceName + " is ON and recording");
            } else {
                System.out.println(deviceName + " is ON and not recording");
            }
        } else {
            if (recording) {
                System.out.println(deviceName + " is OFF and recording");
            } else {
                System.out.println(deviceName + " is OFF and not recording");
            }
        }

    }
}
