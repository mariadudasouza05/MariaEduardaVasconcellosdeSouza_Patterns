public class Main {
    public static void main(String[] args) {
        String mensagem = "Oii, Bem vindo ao Sistema da Duda!";

        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        emailService.sendNotification(mensagem);

        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        smsService.sendNotification(mensagem);

        NotificationService pushService = new NotificationService(new PushNotificationFactory());
        pushService.sendNotification(mensagem);
    }
}