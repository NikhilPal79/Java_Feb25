package AssignmentsOops.Interface2;

public class PushNotificationClass implements PushNotification, NotificationSender{
    private String token;

    @Override
    public void sendNotification(String notification) {
        System.out.println("you have received notification " + token );

    };
}
