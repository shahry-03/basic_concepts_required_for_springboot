package coupling.tightcoupling.case1_if_only_email_notification;

public class AppMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.notifyUser("Email Send!");
    }
}
