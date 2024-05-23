package Problem_1;

public class Main1 {
    public static void main(String[] args) {
        Restaurant1 vegetableRestaurant = new Restaurant1(new VegetableASoupFactory1());
        vegetableRestaurant.serveSoup();

        Restaurant1 mushroomRestaurant = new Restaurant1(new MushroomASoupFactory1());
        mushroomRestaurant.serveSoup();

        Restaurant1 beefRestaurant = new Restaurant1(new BeefASoupFactory1());
        beefRestaurant.serveSoup();
    }
}
