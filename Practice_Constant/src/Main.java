public class Main {
    public static void main(String[] args) {
        Deliver deliver = new Deliver();
        deliver.calculateDeliverPrice(DeliverTypes.AUTO);
        deliver.calculateDeliverPrice(DeliverTypes.WATER);
    }
}