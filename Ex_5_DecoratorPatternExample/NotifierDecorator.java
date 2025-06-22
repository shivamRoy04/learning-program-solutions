public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;
    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }
    public void send(String message) {
        wrappee.send(message);
    }
}