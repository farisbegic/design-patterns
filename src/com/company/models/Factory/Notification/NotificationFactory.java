package com.company.models.Factory.Notification;

public class NotificationFactory {
    public Notification createNotification(NotificationType type) {

        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
