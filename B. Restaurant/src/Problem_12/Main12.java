package Problem_12;

public class Main12 {
    public static void main(String[] args) {
        Restaurant12 restaurant = new Restaurant12();

        Client12 client1 = new Client12("Client 1");
        Client12 client2 = new Client12("Client 2");
        Client12 client3 = new Client12("Client 3");

        restaurant.subscribe(client1);
        restaurant.subscribe(client2);
        restaurant.subscribe(client3);

        restaurant.setOffer("New Menu: Special Discount on all items!");
        restaurant.setOffer("Limited Time Offer: Buy one get one free!");
    }
}
