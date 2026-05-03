package SingleToneDesignPattern;

public class Main
{
    public static void main(String[] args) {
        SimpleLogger simpleLogger = SimpleLogger.getInstance();
        SimpleLogger simpleLogger1 = SimpleLogger.getInstance();

        if (simpleLogger == simpleLogger1) {
            System.out.println("single instance");
        }
    }
}
