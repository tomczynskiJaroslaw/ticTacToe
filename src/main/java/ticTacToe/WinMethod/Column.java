package ticTacToe.WinMethod;

import lombok.AllArgsConstructor;
import ticTacToe.Model;
import ticTacToe.ReadOnlyModel;
import ticTacToe.XO;
@AllArgsConstructor
class Column implements WinMethod{
    private final ReadOnlyModel model;

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(x,0)==xo && model.get(x,1)==xo && model.get(x,2)==xo;
    }
}
