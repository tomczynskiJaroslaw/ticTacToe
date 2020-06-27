package ticTacToe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stetas{

    private List<State> corrects;
    private Iterator<State> correctIterator;
    private State correct;

    public Stetas(List<State> corrects) {
        this.corrects = corrects;

    }

    public void addCorrects(State... corrects) {
        this.corrects.addAll(Arrays.asList(corrects));
        this.correctIterator = this.corrects.iterator();
        this.correct=this.correctIterator.next();
    }

    public void correct(int x,int y) {
        correct.next(x,y);
    }

    public State next() {
        if (!correctIterator.hasNext()) correctIterator = corrects.iterator();
        correct=correctIterator.next();
        return correct;
    }
}
