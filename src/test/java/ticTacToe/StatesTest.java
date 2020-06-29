package ticTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class StatesTest {

    @Test
    void addStates() {
        List<State> list = new ArrayList<>();
        State state = mock(State.class);
        new States(list).addListener(state);
        Assertions.assertEquals(list.get(0),state);
    }

    @Test
    void start() {
        State state = mock(State.class);
        List<State> list = new ArrayList<>(Collections.singletonList(state));
        new States(list).start(0,0);
        verify(state).next(0,0);

    }

    @Test
    void next() {
        State state = mock(State.class);
        List<State> list = new ArrayList<>(
                asList(
                        mock(State.class),
                        mock(State.class),
                        state)
        );
        States states = new States(list);
        states.next();
        Assertions.assertEquals(state,states.next());
    }

    @Test
    void nextCheckIsCircular() {
        State state = mock(State.class);
        List<State> list = new ArrayList<>(
                asList(
                        state,
                        mock(State.class),
                        mock(State.class)
                )
        );
        States states = new States(list);
        states.next();
        states.next();
        states.next();
        Assertions.assertEquals(state,states.next());
    }
}