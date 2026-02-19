package dependency_injection.constructor_injection;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email: "+message);
    }
}
