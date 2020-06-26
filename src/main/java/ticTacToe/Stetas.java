package ticTacToe;

public class Stetas {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void next(State state){
        this.state=state;
    }

    public void next(int x, int y) {
        state.next(x, y);
    }
}
