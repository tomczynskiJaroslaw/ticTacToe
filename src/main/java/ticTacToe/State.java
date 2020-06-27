package ticTacToe;


public class State implements Correct{
    XO xo;
    Model model;
    Stetas stetas;

    public State(XO xo, Model model, Stetas stetas) {
        this.xo = xo;
        this.model = model;
        this.stetas = stetas;
    }

    public void next(int x,int y) {
        model.setCharacter(xo,x,y);
        System.out.println("dfthdter");
    }

    @Override
    public void correct() {
        stetas.next();
    }
}
