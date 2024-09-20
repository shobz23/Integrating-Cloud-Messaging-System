public class CloudMessagingAdapter implements Notification {
    private CloudMessagingService cloudMessagingService;
    private String deviceToken;

    public CloudMessagingAdapter(CloudMessagingService cloudMessagingService, String deviceToken) {
        this.cloudMessagingService = cloudMessagingService;
        this.deviceToken = deviceToken;
    }

    @Override
    public void sendNotification(String message) {
        cloudMessagingService.sendPushMessage(deviceToken, message);
    }
}
