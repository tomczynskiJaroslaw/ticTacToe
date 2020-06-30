package ticTacToe.WinMethod;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ticTacToe.Model;
import ticTacToe.ReadOnlyModel;
import ticTacToe.XO;


public interface WinMethod {
    public abstract boolean method(int x, int y, XO xo);
}
