package Problem_12;

public interface Subject12 {
    void addObserver(Observer12 observer);
    void removeObserver(Observer12 observer);
    void notifyObservers(String message);
}
