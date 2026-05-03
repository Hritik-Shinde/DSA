package SingleToneDesignPattern;

public class SimpleLogger {
    // 1. Static variable to hold the one and only instance
    private static SimpleLogger instance;

    // 2. Private constructor prevents 'new SimpleLogger()' from other classes
    private SimpleLogger() {
        System.out.println("Logger system started.");
    }

    // 3. Public method to provide access to the instance
    public  static synchronized SimpleLogger getInstance() {
        // Only create the object if it doesn't exist yet
            if (instance == null) {
                instance = new SimpleLogger();
            }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

