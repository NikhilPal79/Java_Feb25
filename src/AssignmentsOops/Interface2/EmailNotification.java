package AssignmentsOops.Interface2;

public interface EmailNotification extends NotificationSender {

    @Override
    void sendNotification(String email);
}



