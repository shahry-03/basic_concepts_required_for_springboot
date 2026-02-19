package coupling.loosecoupling.case1_if_only_email_notification;

public class EmailNotification implements NotificationService {
    @Override
    public void send(String message){
        System.out.println(message);
    }
}
