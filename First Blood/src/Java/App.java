package Java;

public class App {

    public static void main(String[] args) {

        //starting the new application
        App app = new App();
        app.initialize();
        app.run();

    }

    //This method loads the new app and data-- if any (*Should be none because this is a calculator app)
    private void initialize(){ //throws FileStorageException {
        System.out.println("Hello, and welcome to my first application");
    }

    private void run() {
        System.out.println("Please select a calculator function below:");
    }
}
