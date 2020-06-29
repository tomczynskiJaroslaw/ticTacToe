package ticTacToe.WinMethod;

import ticTacToe.Model;
import ticTacToe.XO;

public class Column extends WinMethod{

    public Column(Model model) {
        super(model);
    }

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(x,0)==xo && model.get(x,1)==xo && model.get(x,2)==xo;
    }
}
