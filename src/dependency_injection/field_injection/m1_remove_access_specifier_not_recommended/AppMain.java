package dependency_injection.field_injection.m1_remove_access_specifier_not_recommended;

public class AppMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.notificationService = new EmailNotification(); // Direct Injection
        userService.notifyUser("Email Send!");
    }
}
