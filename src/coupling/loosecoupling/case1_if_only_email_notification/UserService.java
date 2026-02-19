package coupling.loosecoupling.case1_if_only_email_notification;

public class UserService {
    private NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void notifyUser(String message){
        notificationService.send("Email: "+message);
    }
}
