package com.company.models.Factory.Notification;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("SMS notification");
    }
}
