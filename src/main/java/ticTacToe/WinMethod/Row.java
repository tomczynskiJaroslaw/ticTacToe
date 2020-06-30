package ticTacToe.WinMethod;

import lombok.AllArgsConstructor;
import ticTacToe.Model;
import ticTacToe.ReadOnlyModel;
import ticTacToe.XO;
@AllArgsConstructor
class Row implements WinMethod {
    private final ReadOnlyModel model;

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(0,y)==xo && model.get(1,y)==xo && model.get(2,y)==xo;
    }
}
