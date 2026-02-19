package dependency_injection.constructor_injection;

public class AppMain {
    public static void main(String[] args) {
        UserService userService = new UserService(new EmailNotification()); //injection
        userService.notifyUser("Email Send!");
    }
}
