package dependency_injection.field_injection.m1_remove_access_specifier_not_recommended;

public class UserService {
    // Private nahi hai
    NotificationService notificationService;
    public void notifyUser(String message){
        notificationService.send(message);
    }
}

/**
 * Lekin... Plain Java me Field Injection karna utna seedha (straightforward) nahi hai jitna Constructor ya Setter injection hai.
 *
 * Kyunki Field Injection ka main rule hai: Field private honi chahiye aur koi Setter/Constructor nahi hona chahiye.
 *
 * Agar field private hai, to AppMain class usko access kaise karegi?
 *
 * Iske 2 tareeqe hain:
 *
 * Ghalat Tareeqa: Field ko public ya package-private kar do.
 *
 * Sahi (Magic) Tareeqa: Java Reflection API use karo.
 *
 * Tareeqa 1: Access Modifiers hata do (Not Recommended) ❌
 * Agar tum private hata do, to AppMain direct inject kar sakta hai. Lekin ye Encapsulation tod deta hai (jo humne Hacker wale example me dekha tha).
 * Ye professional code nahi hai.
 */
