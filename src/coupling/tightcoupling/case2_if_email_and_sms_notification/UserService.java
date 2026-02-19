package coupling.tightcoupling.case2_if_email_and_sms_notification;

public class UserService {
    NotificationService notificationService = new NotificationService();
    //if we do changes inside the NotificationService then we must have to change UserService
    public void notifyUser(String message, String type){
        notificationService.send(message,type);
    }
}

//Agar ek class ke andar change karne se doosri class ko bhi change karna pade
//to uska matlab hai dono classes tightly coupled hain.

/**
 * Tight Coupling:
 *
 * Naya feature chahiye →
 * 👉 Purani class modify karo
 * 👉 Us par depend karne wali class bhi modify karo
 *
 * Matlab:
 *
 * Changes chain reaction ban jaate hain
 *
 * Bugs ka risk zyada
 *
 * Code fragile ho jata hai
 */
