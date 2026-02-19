package coupling.loosecoupling.case2_if_email_and_sms_notification;

import java.util.Scanner;
public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Notification Type (email/sms)");
        String choice = sc.nextLine().toLowerCase();
        if (choice.equals("sms")) {
            //sms Use karo
            UserService userService = new UserService(new SmsNotification());
            userService.notifyUser("Sms Send!");
        } else if (choice.equals("email")) {
            //Email Use karo
            NotificationService emailService = new EmailNotification();
            UserService userService1 = new UserService(emailService);
            userService1.notifyUser("Email send");
        }else {
            System.out.println("Invalid choice");
        }
    }
}