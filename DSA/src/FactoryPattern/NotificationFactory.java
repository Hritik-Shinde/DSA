package FactoryPattern;

public class NotificationFactory {
    public static Notification createNotification(String message) {
        if(message==null){
            return null;
        }
        return switch (message) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Invalid notification message");
        };
    }
}
