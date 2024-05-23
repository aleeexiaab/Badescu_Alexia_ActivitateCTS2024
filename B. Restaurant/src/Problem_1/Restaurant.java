package Problem_1;

public class Restaurant {
    private ASoupFactory soupFactory;

    public Restaurant(ASoupFactory soupFactory) {
        this.soupFactory = soupFactory;
    }

    public void serveSoup() {
        ISoup soup = soupFactory.createSoup();
        soup.prepare();
    }
}
