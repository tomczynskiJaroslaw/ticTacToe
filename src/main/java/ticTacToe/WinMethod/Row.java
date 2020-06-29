package ticTacToe.WinMethod;

import ticTacToe.Model;
import ticTacToe.XO;

public class Row extends WinMethod {
    public Row(Model model) {
        super(model);
    }

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(0,y)==xo && model.get(1,y)==xo && model.get(2,y)==xo;
    }
}
