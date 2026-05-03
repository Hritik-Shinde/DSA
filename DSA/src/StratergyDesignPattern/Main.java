package StratergyDesignPattern;

public class Main {
    public static void main(String[] args) {
        NotificationContext notificationContext = new NotificationContext();
        notificationContext.setStratergyNoticication(new EmailNotification());
        notificationContext.setNotication("Email notification");

        notificationContext.setStratergyNoticication(new SmsNotification());
        notificationContext.setNotication("Sms notification");
    }
}
