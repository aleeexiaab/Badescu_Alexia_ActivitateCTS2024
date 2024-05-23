package Problem_1;

public class VegetableASoupFactory1 extends ASoupFactory1 {
    @Override
    public ISoup1 createSoup() {
        return new VegetableSoup1();
    }
}
