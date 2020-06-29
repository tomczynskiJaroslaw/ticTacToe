package ticTacToe.WinMethod;

import ticTacToe.Model;
import ticTacToe.XO;

public class DiagonalLeftUp extends WinMethod {
    public DiagonalLeftUp(Model model) {
        super(model);
    }

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(0,0)==xo && model.get(1,1)==xo && model.get(2,2)==xo;
    }
}
