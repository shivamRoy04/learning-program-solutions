public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Singleton works!");
        System.out.println(logger1 == logger2);
    }
}