package coupling.tightcoupling.case2_if_email_and_sms_notification;

public class NotificationService {
    public void send(String message, String type){
        if (type.equals("email")){
            System.out.println("Email: "+message);
        } else if (type.equals("sms")) {
            System.out.println("SMS: "+message);
        }
    }
}
