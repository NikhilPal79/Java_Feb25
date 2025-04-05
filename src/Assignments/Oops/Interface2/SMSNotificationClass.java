package Assignments.Oops.Interface2;

public class SMSNotificationClass implements NotificationSender, SMSNotification{

    public String smsNumber;

    public SMSNotificationClass(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("sending sms to " + smsNumber + message );
    }
}
