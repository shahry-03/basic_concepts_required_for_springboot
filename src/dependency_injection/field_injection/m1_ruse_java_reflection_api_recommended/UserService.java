package dependency_injection.field_injection.m1_ruse_java_reflection_api_recommended;

public class UserService {
    // Ye PRIVATE hai. Bahar se access mana hai.
    private NotificationService service;
    public void notifyUser(String message){
        service.send(message);
    }
}


/**
 * Tareeqa 2: Java Reflection API (The "Magic" Way) ✨
 * Frameworks jaise Spring Boot asal me yahi tareeqa use karte hain.
 *
 * Jab tum Spring me @Autowired likhte ho, to Spring peeche chup kar Java Reflection use karta hai taake wo tumhari Private fields ke andar zabardasti ghus sake.
 *
 * Hum plain Java me wahi "Jugaad" khud likh sakte hain. Dekho kaise:
 *
 * Step 1: UserService (Private field, No Setter, No Constructor)
 * Step 2: AppMain (Reflection ka Jaadu)
 * Yahan hum Java ki Reflection API use karenge taake private field ka lock tod sakein.
 *
 *
 *
 * Framework vs Plain Java
 * Ab tum socho, agar tumhe 50 jagah Field Injection karni ho, to tumhe har baar ye 4-5 lines ka ganda code (getDeclaredField, setAccessible, field.set) likhna padega.
 *
 * Isliye hum Framework use karte hain!
 *
 * Plain Java: Tumhe Reflection ka code khud likhna padta hai (Bohat mushkil aur verbose).
 *
 * Spring Boot: Tum bas @Autowired likhte ho. Spring peeche wahi Reflection wala code khud chala deta hai.
 *
 * Summary: Framework ke bina Field Injection Reflection API ke zariye hoti hai. Ye wahi technique hai jo frameworks use karte hain, bas frameworks ne is complexity ko chupaya hua hai.
 */

