package Problem_1;

public class MushroomASoupFactory1 extends ASoupFactory1 {
    @Override
    public ISoup1 createSoup() {
        return new MushroomSoup1();
    }
}
