package coupling.tightcoupling.case1_if_only_email_notification;

public class UserService {
    NotificationService notificationService = new NotificationService();
    public void notifyUser(String message){
        notificationService.send(message);
    }
}
