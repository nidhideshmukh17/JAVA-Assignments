public class Main {
    public static void main(String[] args) {

        HTTPConnection http = new HTTPConnection();
        FTPConnection ftp = new FTPConnection();
        WebSocketConnection webSocket = new WebSocketConnection();

        Object[] arr = { http, ftp, webSocket };

        NetworkManager nM = new NetworkManager(arr);

        nM.connectAll();
        nM.sendAll("This is a Network Connection in a distributed computing environment.");
        nM.receiveAll();
        nM.disconnectAll();
    }
}
