package Problem_1;

public class VegetableASoupFactory extends ASoupFactory {
    @Override
    public ISoup createSoup() {
        return new VegetableSoup();
    }
}
