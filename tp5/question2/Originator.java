package question2;
import java.util.List;
public class Originator{
    private List<String> state;
    public void set(List<String> newState){
        state = newState;
    }
    public Memento storeInMemento(){
        return new Memento(state);
    }
    public List<String> restoreFromMemento(Memento memento){
        state = memento.getSavedState();
        return state;
    }
}
