public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        market.register(mobile);
        market.setPrice(200);
    }
}