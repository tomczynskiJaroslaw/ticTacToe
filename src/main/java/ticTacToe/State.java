package ticTacToe;


public class State{
    private final XO xo;
    private final Model model;
    private final States states;

    public State(XO xo, Model model, States states) {
        this.xo = xo;
        this.model = model;
        this.states = states;
    }

    public void next(int x,int y) {
        model.setCharacter(xo,x,y);
    }

    public void correct() {
        states.next();
    }
}
