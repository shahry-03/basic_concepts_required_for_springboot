package coupling.loosecoupling.case1_if_only_email_notification;

public class AppMain {
    public static void main(String[] args) {
        UserService userService = new UserService(new EmailNotification());
        userService.notifyUser("Email Send1");
    }
}
