package ticTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ticTacToe.WinMethod.WinMethods;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;

class ModelTest {

    @Test
    public void testState(){
        State state = mock(State.class);
        Assertions.assertEquals(state,
                new States(new ArrayList<>(asList(state))).next()
        );

    }

//    @Test
//    public void testIsWin(){
//        WinMethods win = mock(WinMethods.class);
//        Model model = new Model(mock(List.class))
//                .setCharacter(XO.O,0,0)
//                .setCharacter(XO.O,1,1)
//                .setCharacter(XO.O,2,2);
//        model.addListenerWinMethods(win);
//        verify(win).win(XO.O);
//    }

    @Test
    public void testGet(){

        Assertions.assertEquals(XO.X,
                new Model(
                        mock(List.class))
                    .setCharacter(XO.X,0,1)
                    .get(0,1)
        );
    }

    @Test
    public void testSetCharacter(){
        Model model = new Model(new ArrayList<>());
        States states = mock(States.class);
        model.addListenerStates(states);
        model.setCharacter(XO.X,0,0);
        model.setCharacter(XO.X,0,0);
        verify(states,times(1)).next();
    }

    @Test
    public void addListenerStates(){
        List<States> list = new ArrayList<>();
        States states = mock(States.class);
        new Model(list).addListenerStates(states);
        Assertions.assertEquals(list.get(0),states);
    }


}