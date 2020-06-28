package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class StateTest {

    @Test
    void testNext(){
        Model model = mock(Model.class);
        new State(XO.O,model,mock(States.class)).next(0,0);
        verify(model).setCharacter(XO.O,0,0);
    }

    @Test
    void testCorrect(){
        States states = mock(States.class);
        new State(XO.X,mock(Model.class), states);
        verify(states).next();
    }
}