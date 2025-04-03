package AssignmentsOops.Interface2;

public class PushNotificationClass implements PushNotification, NotificationSender{
    private String token;

    public PushNotificationClass(String token) {
        this.token = token;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("sending a notification " + token + message );

    };
}
