package Problem_3;

public class SoupFactory3 {
    public ISoup3 createSoup(SoupType3 type) throws IllegalAccessException {
        switch(type) {
            case VEGETABLE -> {
                return new VegetableSoup3();
            }
            case MUSHROOM -> {
                return new MushroomSoup3();
            }
            case BEEF -> {
                return new BeefSoup3();
            }
            default -> throw new IllegalAccessException("Unknown soup type.");
        }
    }
}
