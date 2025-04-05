package Assignments.Oops.Interface2;

public class EmailNotificationClass implements NotificationSender,EmailNotification{

    private String senderEmail;

    public EmailNotificationClass(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("sending email from " + senderEmail + message );

    };
}
