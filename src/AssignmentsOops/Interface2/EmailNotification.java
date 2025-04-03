package AssignmentsOops.Interface2;

public interface EmailNotification extends NotificationSender {

    @Override
    char sendNotification(String email);
}



