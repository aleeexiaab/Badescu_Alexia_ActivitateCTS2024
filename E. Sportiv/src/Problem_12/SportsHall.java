package Problem_12;

import java.util.ArrayList;
import java.util.List;

public class SportsHall implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newMatchScheduled(String sport) {
        notifyObservers("New " + sport + " match scheduled!");
    }
}
