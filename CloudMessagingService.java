public class CloudMessagingService {
    public void sendPushMessage(String deviceToken, String message) {
        System.out.println("Push notification sent to device: " + deviceToken + ", Message: " + message);
    }
}
