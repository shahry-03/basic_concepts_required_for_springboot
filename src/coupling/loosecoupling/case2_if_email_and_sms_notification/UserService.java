package coupling.loosecoupling.case2_if_email_and_sms_notification;

public class UserService {
    NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void notifyUser(String message){
        notificationService.send(message);
    }

    // Ab yaha par hum har bar UserService ko change nahi karenge bus ek naye class banayenge
    /**
     * Loose Coupling:
     *
     * Naya feature chahiye →
     * 👉 Sirf nayi class banao
     * 👉 Purani classes ko chhedo hi mat
     *
     * Matlab:
     *
     * Changes isolated rehte hain
     *
     * Code stable rehta hai
     *
     * System grow karna easy hota hai
     */
}
