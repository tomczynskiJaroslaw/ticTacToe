package ticTacToe;

public class Model {
    Correct correct;
    Win win;

    XO[][] xos;

    public Model(int count,Correct correct) {
        xos = new XO[count][count];
        for (int i=0;i<count;i++){
            for (int j=0;j<count;j++){
                xos[i][j]=XO.EMPTY;
            }
        }
    }

    public Model setCharacter(XO xo, int x, int y) {
        if (xos[y][x]==XO.EMPTY){
            xos[y][x]=xo;
            correct.correct();
        }
        return this;
    }

    public void addListenerCorrect(Correct correct) {
        if (this.correct!=null) this.correct=correct; else new RuntimeException("two listeners but allowed only one");
    }

    public void addListenerWin(Win win) {
        if (this.win!=null) this.win=win; else new RuntimeException("two listeners but allowed only one");
    }
}
