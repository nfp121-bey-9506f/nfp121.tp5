package question3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFactory<T> extends TreeSet implements Factory<Set>,Comparable{
    public Set create(){
        return new TreeSet();
    }
    public int compareTo(Object o){
        if(o instanceof TreeSet){
            TreeSet aComparer = (TreeSet) o;
            if(this.size() > aComparer.size()) return 1;
            else if(this.size() < aComparer.size())return -1;
            else{
                boolean egal = this.equals(aComparer);
                if(egal) return 0;
                else return -1;
            }
        }
        return -1;
    } 

}
