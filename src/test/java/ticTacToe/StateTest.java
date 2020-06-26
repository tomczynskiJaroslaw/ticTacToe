package ticTacToe;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    @Test
    public void test(){
        State state = mock(State.class);
        assertEquals(state,new State(state).next());
    }
}