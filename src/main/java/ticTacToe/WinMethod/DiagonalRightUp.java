package ticTacToe.WinMethod;

import lombok.AllArgsConstructor;
import ticTacToe.Model;
import ticTacToe.ReadOnlyModel;
import ticTacToe.XO;
@AllArgsConstructor
class DiagonalRightUp implements WinMethod {
    private final ReadOnlyModel model;

    @Override
    public boolean method(int x, int y, XO xo) {
        return model.get(0,2)==xo && model.get(1,1)==xo && model.get(2,0)==xo;
    }
}
