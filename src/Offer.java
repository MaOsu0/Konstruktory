public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product productOffer, double priceOffer, boolean specialOffer) {
        product = productOffer;
        price = priceOffer;
        special = specialOffer;
    }

    void showOffer (){
        System.out.println("Nazwa produktu to " + product.name + " marki " + product.producer + " za cenę "
        + price + " zł. Czy jest na promocji? " + special);
    }
}
