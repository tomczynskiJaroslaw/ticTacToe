package ticTacToe.WinMethod;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ticTacToe.Model;
import ticTacToe.XO;


public abstract class WinMethod {
    protected final Model model;

    public WinMethod(Model model) {
        this.model = model;
    }

    public abstract boolean method(int x, int y, XO xo);
}
