package AssignmentsOops.Interface2;

public class EmailNotificationClass implements NotificationSender,EmailNotification{

    private String senderEmail;

    @Override
    public void sendNotification(String message) {
        System.out.println("you have received email from " + senderEmail)

    };
}
