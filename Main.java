public class Main {
    public static void main(String[] args) {
        // Create an instance of the third-party Cloud Messaging Service
        CloudMessagingService cloudMessagingService = new CloudMessagingService();

        // Use the CloudMessagingAdapter to integrate cloud messaging into the Notification system
        Notification notification = new CloudMessagingAdapter(cloudMessagingService, "device-token-12345");

        // Send a notification via cloud messaging
        notification.sendNotification("Your order has been shipped.");
    }
}
