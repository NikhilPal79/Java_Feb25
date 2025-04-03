package AssignmentsOops.Interface2;

public interface SMSNotification extends NotificationSender {



    @Override
    void sendNotification(String smsNumber);
}
