package coupling.tightcoupling.case2_if_email_and_sms_notification;

public class AppMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.notifyUser("Notification Send!", "sms");
    }
}
