package ticTacToe.WinMethod;

import ticTacToe.ReadOnlyModel;
import ticTacToe.Win;
import ticTacToe.XO;

public class WinMethods {

    private final WinMethod[][][] winMethod;
    private final ReadOnlyModel readOnlyModel;
    private final Win win;

    public WinMethods(WinMethod[][][] winMethod, ReadOnlyModel readOnlyModel, Win win) {
        this.winMethod = winMethod;
        this.readOnlyModel = readOnlyModel;
        this.win = win;
        prepareWinMethod();
    }

    private void prepareWinMethod() {
        Column column = new Column(readOnlyModel);
        Row row = new Row(readOnlyModel);
        DiagonalRightUp diagonalRightUp = new DiagonalRightUp(readOnlyModel);
        DiagonalLeftUp diagonalLeftUp = new DiagonalLeftUp(readOnlyModel);

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

    public boolean isWin(int x, int y, XO xo) {
        for (int i=0;i<winMethod[x][y].length;i++){
            if (winMethod[x][y][i].method(x,y,xo)){
                win.win(xo);
                return true;
            }
            System.out.println(winMethod[x][y][i].getClass());
        }
        return false;
    }
}
