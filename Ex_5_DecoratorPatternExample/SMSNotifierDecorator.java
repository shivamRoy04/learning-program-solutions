public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier wrappee) {
        super(wrappee);
    }
    public void send(String message) {
        super.send(message);
        System.out.println("SMS: " + message);
    }
}