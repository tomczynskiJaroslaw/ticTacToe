package ticTacToe;

import ticTacToe.WinMethod.*;

import java.util.Arrays;
import java.util.List;

public class Model {
    private final int COUNT = 3;

    private final List<States> stets;
    private final Win win;

    private XO[][] xos;

    private WinMethod[][][] winMethod;

    public Model(List<States> stets,Win win) {
        this.stets = stets;
        this.win = win;
        prepareXOS();
        prepareWinMethod();
    }

    private void prepareWinMethod() {
        Column column = new Column(this);
        Row row = new Row(this);
        DiagonalRightUp diagonalRightUp = new DiagonalRightUp(this);
        DiagonalLeftUp diagonalLeftUp = new DiagonalLeftUp(this);
        winMethod = new WinMethod[3][3][];
        winMethod[0][0] = new WinMethod[]{column,row,diagonalLeftUp};
        winMethod[2][2] = new WinMethod[]{column,row,diagonalLeftUp};

        winMethod[1][1] = new WinMethod[]{column,row,diagonalLeftUp,diagonalRightUp};

        winMethod[0][2] = new WinMethod[]{column,row,diagonalRightUp};
        winMethod[2][0] = new WinMethod[]{column,row,diagonalRightUp};

        winMethod[1][0] = new WinMethod[]{column,row};
        winMethod[0][1] = new WinMethod[]{column,row};
        winMethod[2][1] = new WinMethod[]{column,row};
        winMethod[1][2] = new WinMethod[]{column,row};
    }

    private void prepareXOS() {
        xos = new XO[COUNT][COUNT];
        for (int i=0;i<COUNT;i++){
            for (int j=0;j<COUNT;j++){
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
            if (!isWin(x,y,xo))
                stets.forEach(States::next);
        }
        return this;
    }

    private boolean isWin(int x,int y,XO xo) {
        for (int i=0;i<winMethod[x][y].length;i++){
            if (winMethod[x][y][i].method(x,y,xo)){
                win.win(xo);
                return true;
            }
            System.out.println(winMethod[x][y][i].getClass());
        }
        return false;
    }

    public void addListenerStates(States... stets) {
        this.stets.addAll(Arrays.asList(stets));
    }

//    public void addListenerWin(Win win) {
//        if (this.win!=null) this.win=win; else new RuntimeException("two listeners but allowed only one");
//    }
}
