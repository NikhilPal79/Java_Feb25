package Assignments.Oops.Interface2;

public class Main {
    public static void main(String[] args) {

        SMSNotificationClass smsNotificationClass = new SMSNotificationClass("4165203745");
        smsNotificationClass.sendNotification(" You have a new sms");
        System.out.println();

        EmailNotificationClass emailNotificationClass = new EmailNotificationClass("nikhil@gmail.com");
        emailNotificationClass.sendNotification(" You have a new email");
        System.out.println();

        PushNotificationClass pushNotificationClass = new PushNotificationClass("abc789");
        pushNotificationClass.sendNotification(" You have a new token");




    }
}
