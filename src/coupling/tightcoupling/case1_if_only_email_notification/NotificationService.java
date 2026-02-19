package coupling.tightcoupling.case1_if_only_email_notification;

public class NotificationService {
    public void send(String message){
        System.out.println("Email: "+message);
    }
}
