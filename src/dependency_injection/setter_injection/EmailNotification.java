package dependency_injection.setter_injection;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email: "+message);
    }
}
