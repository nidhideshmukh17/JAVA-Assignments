public class NetworkManager {
    private Object[] arr;

    public NetworkManager(Object[] arr) {
        this.arr = arr;
    }

    public void connectAll() {
        for (int i = 0; i < arr.length; i++) {
            Object obj = arr[i];
            if (obj instanceof Connectable) {
                ((Connectable) obj).connect();
            }
        }
    }

    public void sendAll(String message) {
        for (int i = 0; i < arr.length; i++) {
            Object obj = arr[i];
            if (obj instanceof Sendable) {
                ((Sendable) obj).send(message);
            }
        }
    }

    public void receiveAll() {
        for (int i = 0; i < arr.length; i++) {
            Object obj = arr[i];
            if (obj instanceof Receivable) {
                ((Receivable) obj).receive();
            }
        }
    }

    public void disconnectAll() {
        for (int i = 0; i < arr.length; i++) {
            Object obj = arr[i];
            if (obj instanceof Disconnectable) {
                ((Disconnectable) obj).disconnect();
            }
        }
    }
}