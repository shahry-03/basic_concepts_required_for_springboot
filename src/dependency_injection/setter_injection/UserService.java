package dependency_injection.setter_injection;

public class UserService {
    private NotificationService notificationService;
    //setter ke zariye injection
    public void setService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void notifyUser(String message){
        notificationService.send(message);
    }
}
