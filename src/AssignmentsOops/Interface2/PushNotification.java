package AssignmentsOops.Interface2;

public interface PushNotification extends NotificationSender {

    @Override
    void sendNotification(String message);
}
