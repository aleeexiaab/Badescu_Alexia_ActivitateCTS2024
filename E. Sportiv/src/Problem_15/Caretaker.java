package Problem_15;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<MatchMemento> mementoList = new ArrayList<>();

    public void add(MatchMemento state) {
        mementoList.add(state);
    }

    public MatchMemento get(int index) {
        return mementoList.get(index);
    }
}
