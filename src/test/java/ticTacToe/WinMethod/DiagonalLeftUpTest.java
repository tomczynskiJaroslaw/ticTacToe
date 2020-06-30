package ticTacToe.WinMethod;

import org.junit.jupiter.api.Test;
import ticTacToe.Model;
import ticTacToe.ReadOnlyModel;
import ticTacToe.XO;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DiagonalLeftUpTest {

    @Test
    void method() {
        ReadOnlyModel model = mock(ReadOnlyModel.class);
        when(model.get(0,0)).thenReturn(XO.O);
        when(model.get(1,1)).thenReturn(XO.O);
        when(model.get(2,2)).thenReturn(XO.O);
        assertTrue(new DiagonalLeftUp(model).method(0,0,XO.O));
    }
}