package ticTacToe;

import java.util.Arrays;
import java.util.List;

public class Model {
    List<Stetas> correct;
    Win win;

    XO[][] xos;

    public Model(int count,List<Stetas> correct) {
        this.correct=correct;
        xos = new XO[count][count];
        for (int i=0;i<count;i++){
            for (int j=0;j<count;j++){
                xos[i][j]=XO.EMPTY;
            }
        }
    }

    public XO get(int x,int y){
        return xos[y][x];
    }

    public Model setCharacter(XO xo, int x, int y) {
        if (xos[y][x]==XO.EMPTY){
            xos[y][x]=xo;
            correct.forEach(Stetas::next);
            System.out.println("df");
        }
        return this;
    }

    public void addListenerCorrect(Stetas... correct) {
        this.correct.addAll(Arrays.asList(correct));
    }

//    public void addListenerWin(Win win) {
//        if (this.win!=null) this.win=win; else new RuntimeException("two listeners but allowed only one");
//    }
}
