package Problem_1;

public class MushroomASoupFactory extends ASoupFactory {
    @Override
    public ISoup createSoup() {
        return new MushroomSoup();
    }
}
