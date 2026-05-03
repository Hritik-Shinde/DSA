package StratergyDesignPattern;

public class NotificationContext {
    private  Notification notification;

    public void setStratergyNoticication(Notification notification) {
        this.notification = notification;
    }

    public void setNotication(String message) {
        notification.sendNotification(message);
    }
}
