package ticTacToe;

import java.util.Arrays;
import java.util.List;

public class Model {
    private final List<States> stets;
    private Win win;

    private XO[][] xos;

    public Model(int count,List<States> stets) {
        this.stets = stets;
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
            stets.forEach(States::next);
        }
        return this;
    }

    public void addListenerStates(States... stets) {
        this.stets.addAll(Arrays.asList(stets));
    }

//    public void addListenerWin(Win win) {
//        if (this.win!=null) this.win=win; else new RuntimeException("two listeners but allowed only one");
//    }
}
