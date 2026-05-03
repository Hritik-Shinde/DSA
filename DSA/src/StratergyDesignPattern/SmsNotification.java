package StratergyDesignPattern;

public class SmsNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("From sms notification"+message);
    }
}
