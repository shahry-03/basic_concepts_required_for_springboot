package dependency_injection.field_injection.m1_remove_access_specifier_not_recommended;

public class EmailNotification implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Email: "+message);
    }
}
