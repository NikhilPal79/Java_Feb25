package AssignmentsOops.Interface2;

public interface SMSNotification extends NotificationSender {



    @Override
    char sendNotification(String sms);
}
