package Problem_12;

import java.util.ArrayList;
import java.util.List;

public class Hospital12 implements Subject12{

    private List<Observer12> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer12 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer12 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer12 observer : observers) {
            observer.update(message);
        }
    }

    public void newVirusAlert(String virusName) {
        String message = "Alert: A new virus has been detected - " + virusName;
        notifyObservers(message);
    }
}
