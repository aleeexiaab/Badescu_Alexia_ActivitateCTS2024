package Problem_1;

public class BeefASoupFactory extends ASoupFactory {
    @Override
    public ISoup createSoup() {
        return new BeefSoup();
    }
}
