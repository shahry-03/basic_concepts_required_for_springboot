package dependency_injection.field_injection.m1_ruse_java_reflection_api_recommended;

public class EmailNotification implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Email: "+message);
    }
}
