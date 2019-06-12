package question2;
import java.util.List;

public class Memento{
    private List<String> state;
    public Memento( List<String> liste){
        state = liste;
    }
    public List<String> getSavedState(){
        return state;
    }
}
