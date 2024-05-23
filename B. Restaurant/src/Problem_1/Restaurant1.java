package Problem_1;

public class Restaurant1 {
    private ASoupFactory1 soupFactory;

    public Restaurant1(ASoupFactory1 soupFactory) {
        this.soupFactory = soupFactory;
    }

    public void serveSoup() {
        ISoup1 soup = soupFactory.createSoup();
        soup.prepare();
    }
}
