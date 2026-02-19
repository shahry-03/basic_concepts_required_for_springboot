package web_framework.why_we_need_framework.database_connection.without_framework;

public class MainClass {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        manager.saveUser("Shahrayar", "shahrayarsahito7@gmail.com");
    }
}
