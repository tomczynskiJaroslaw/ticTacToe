package ticTacToe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class States {

    private List<State> states;
    private Iterator<State> correctIterator;
    private State state;

    public States(List<State> states) {
        if (states==null) throw  new NullPointerException();
        this.states = states;
        if (states.size()>0)
            addListener(states.toArray(new State[1]));
    }

    public void addListener(State... state) {

        this.states.addAll(Arrays.asList(state));
        this.correctIterator = this.states.iterator();
        this.state =this.correctIterator.next();
        System.out.println(states+"\t\n\n"+correctIterator+"\t\n\n"+state);
    }

    public void start(int x, int y) {
        if (state == null) throw new RuntimeException("Add states first!");
        state.next(x,y);
    }

    public State next() {
        if (correctIterator == null) throw new RuntimeException("Add states first!");
        if (!correctIterator.hasNext()) correctIterator = states.iterator();
        state = correctIterator.next();
        return state;
    }
}
