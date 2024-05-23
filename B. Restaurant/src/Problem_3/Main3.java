package Problem_3;

public class Main3 {
    public static void main(String[] args) throws IllegalAccessException {
        SoupFactory3 factory = new SoupFactory3();

        ISoup3 vegetablesoup = factory.createSoup(SoupType3.VEGETABLE);
        vegetablesoup.description();

        ISoup3 mushroomSoup = factory.createSoup(SoupType3.MUSHROOM);
        mushroomSoup.description();

        ISoup3 beefSoup = factory.createSoup(SoupType3.BEEF);
        beefSoup.description();
    }
}
