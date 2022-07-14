package com.company.models.Factory.Notification;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Email notification");
    }
}
