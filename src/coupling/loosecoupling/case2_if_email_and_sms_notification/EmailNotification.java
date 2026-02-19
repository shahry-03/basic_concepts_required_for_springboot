package coupling.loosecoupling.case2_if_email_and_sms_notification;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email: "+message);
    }
}
