package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        boolean exists = table.contains(t);
        if(exists) {
            System.out.println("Cet element est deja existant dans l'ensemble");
            return false;
        }
        table.add(t);   
        return true;
    }
     
    public Ensemble<T> union(Ensemble<? extends T> e) {
        // à compléter pour la question1-2

        return null;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        // à compléter pour la question1-2

        return null;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        // à compléter pour la question1-2

        return null;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        // à compléter pour la question1-2

        return null;
    }
    
}
