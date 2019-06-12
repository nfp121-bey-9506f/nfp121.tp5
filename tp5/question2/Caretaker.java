package question2;

import java.util.Stack;
public class Caretaker{
    Stack<Memento> savedStates = new Stack<Memento>();
    public void addMemento(Memento memento){savedStates.push(memento);}
    public Memento getMemento(){return savedStates.pop();}
}
