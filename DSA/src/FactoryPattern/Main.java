package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification email = notificationFactory.createNotification("EMAIL");
        email.notifyUser();
        Notification PUsh = notificationFactory.createNotification("PUSH");
        PUsh.notifyUser();
        Notification sms =  notificationFactory.createNotification("SMS");
        sms.notifyUser();
    }
}
