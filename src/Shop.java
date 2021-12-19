public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna","Milka");

        Offer offer1 = new Offer(product1,3.99,true);

        offer1.showOffer();

        Offer offer2 = new Offer(new Product("Sok", "Tymbark"), 5.49, false);
        offer2.showOffer();
    }
}
