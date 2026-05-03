package StratergyDesignPattern;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("From email notification"+message);
    }
}
