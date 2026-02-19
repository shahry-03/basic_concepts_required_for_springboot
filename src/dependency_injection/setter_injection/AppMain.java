package dependency_injection.setter_injection;

public class AppMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.setService(new EmailNotification());// pehle object banaya baad me inject kiya
        userService.notifyUser("Email Send!");
    }
}
