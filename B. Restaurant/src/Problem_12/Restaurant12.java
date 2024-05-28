package Problem_12;

import java.util.ArrayList;
import java.util.List;

public class Restaurant12 implements Subject12{
    private List<Observer12> clients;
    private String offer;

    public Restaurant12() {
        clients = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer12 observer) {
        clients.add(observer);
    }

    @Override
    public void unsubscribe(Observer12 observer) {
        clients.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer12 client : clients) {
            client.update(offer);
        }
    }

    public void setOffer(String offer) {
        this.offer = offer;
        notifyObservers();
    }
}
