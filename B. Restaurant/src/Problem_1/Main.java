package Problem_1;

public class Main {
    public static void main(String[] args) {
        Restaurant vegetableRestaurant = new Restaurant(new VegetableASoupFactory());
        vegetableRestaurant.serveSoup();

        Restaurant mushroomRestaurant = new Restaurant(new MushroomASoupFactory());
        mushroomRestaurant.serveSoup();

        Restaurant beefRestaurant = new Restaurant(new BeefASoupFactory());
        beefRestaurant.serveSoup();
    }
}
