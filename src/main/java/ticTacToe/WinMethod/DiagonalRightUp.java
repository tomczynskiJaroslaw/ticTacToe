package ticTacToe.WinMethod;

import ticTacToe.Model;
import ticTacToe.XO;

public class DiagonalRightUp extends WinMethod {
    public DiagonalRightUp(Model model) {
        super(model);
    }

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(0,2)==xo && model.get(1,1)==xo && model.get(2,0)==xo;
    }
}
