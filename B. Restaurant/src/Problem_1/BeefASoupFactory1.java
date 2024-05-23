package Problem_1;

public class BeefASoupFactory1 extends ASoupFactory1 {
    @Override
    public ISoup1 createSoup() {
        return new BeefSoup1();
    }
}
