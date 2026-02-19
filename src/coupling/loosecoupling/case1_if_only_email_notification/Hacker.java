package coupling.loosecoupling.case1_if_only_email_notification;


public class Hacker {
    public static void main(String[] args) {
        //Fake Notification Service
        NotificationService notificationService = new EmailNotification();
        UserService userService = new UserService(notificationService);
        // Direct access allowed (kyon ke private nahi)
        //userService.notificationService = null;   // 👈 attack if we do private then we can
        //not do the field notificationService null otherwise we will get compile-time error

        // Ab crash hoga
        userService.notifyUser("Hello"); // NullPointerException
    }

}
