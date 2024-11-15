public class Main {
    public static void main(String[] args){

        Test T = new Test();
        T.setDaemon(true);
        T.start();
        System.out.println("Main Thread"); //if this line is commented then I don't get any output
                                           //because main thread is not working
    }
}

//if main thread is not performing a task Daemon thread will not provide a service