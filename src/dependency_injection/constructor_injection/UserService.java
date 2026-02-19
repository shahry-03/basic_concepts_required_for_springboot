package dependency_injection.constructor_injection;

public class UserService {
        private NotificationService notificationService;
        // Constructor ke zariye injection
        public UserService(NotificationService notificationService){
            this.notificationService = notificationService;
        }
        public void notifyUser(String message){
            notificationService.send(message);
        }


}
