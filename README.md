# Integrating-Cloud-Messaging-System
This project demonstrates the Adapter Pattern in Java, applied to a Cloud Messaging System. The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together by using an adapter. In this project, we integrate a third-party cloud messaging service (like Firebase Cloud Messaging) into an existing notification system.

# Key Features
Adapter Pattern: Integrates the cloud messaging API into the existing notification system by adapting the cloud messaging service’s API to the system’s Notification interface.
Notification Interface: Defines a common interface for sending notifications.
CloudMessagingService: A third-party API for sending push notifications to mobile devices.
CloudMessagingAdapter: Adapts the third-party cloud messaging API to match the notification interface used by the system.

# Design Pattern Used
Adapter Pattern - This pattern allows us to adapt a third-party API (Cloud Messaging Service) to work with our system’s interface. It enables the system to send notifications through various methods (email, cloud messaging, etc.) without changing the underlying system logic.

# Project Structure
The code is structured into the following files:

Notification.java - Interface that defines the method sendNotification() for sending notifications.
CloudMessagingService.java - A third-party class that sends push notifications using a different method (sendPushMessage()).
CloudMessagingAdapter.java - Adapter class that implements the Notification interface and adapts the CloudMessagingService API to work with the notification system.
Main.java - Testing class that demonstrates how the adapter is used to send push notifications through the cloud messaging service.

# How It Works
The Notification interface defines a method sendNotification(String message) that is used by the system to send notifications.
The CloudMessagingService class is a third-party API that provides the method sendPushMessage() to send push notifications to mobile devices.
The CloudMessagingAdapter implements the Notification interface and adapts the CloudMessagingService's API, allowing the system to send notifications via cloud messaging.
The client (Main.java) interacts with the Notification interface, and the adapter translates the calls to the cloud messaging service.

# Project Requirements
Java Version: Java SE 8 or later
IDE: You can use IntelliJ IDEA, Eclipse, or any other Java-compatible IDE.
Command Line: Alternatively, you can compile and run the project using the command line.

# Future Enhancements
Add support for additional cloud messaging providers (e.g., AWS SNS or Microsoft Azure) by creating new adapters.
Implement logging and error handling for failed push notifications and retries.
Allow dynamic device token input from users rather than hardcoding the device token.
