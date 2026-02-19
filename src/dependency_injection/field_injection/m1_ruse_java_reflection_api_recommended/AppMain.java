package dependency_injection.field_injection.m1_ruse_java_reflection_api_recommended;

import java.lang.reflect.Field;

public class AppMain {
    public static void main(String[] args) throws Exception {
        // 1. Object banaya (abhi service null hai)
        UserService userService= new UserService();

        // 2. Email Service banayi (Dependency)
        NotificationService email = new EmailNotification();

        // --- FIELD INJECTION START (Manual Reflection) ---
        // A. Class se pucho ke "service" naam ki field kahan hai?
        Class<?> c = userService.getClass();
        Field field = c.getDeclaredField("service");

        // B. MAGIC: Private field ka lock todo! 🔓
        field.setAccessible(true);

        // C. Injection: UserService object ke andar email daal do
        field.set(userService, email);

        // --- FIELD INJECTION END ---


        // Ab chala kar dekho
        userService.notifyUser("Email Send via Reflection");

    }
}
