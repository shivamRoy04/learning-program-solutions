public class Main {
    public static void main(String[] args) {
        RazorpayGateway gateway = new RazorpayGateway();
        PaymentProcessor processor = new RazorpayAdapter(gateway);
        processor.processPayment();
    }
}