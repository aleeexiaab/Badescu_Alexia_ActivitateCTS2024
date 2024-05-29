package Problem_12;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy implements Subject{
    private List<Observer> clients = new ArrayList<>();
    private String offer;

    @Override
    public void subscribe(Observer observer) {
        clients.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        clients.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer client : clients) {
            client.update(offer);
        }
    }

    public void newOffer(String offer) {
        this.offer = offer;
        notifyObservers();
    }
}
