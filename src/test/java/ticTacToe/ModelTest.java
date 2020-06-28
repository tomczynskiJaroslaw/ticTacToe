package ticTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class ModelTest {

    @Test
    public void testIsWin(){
        Win win = mock(Win.class);
        Model model = new Model(3, Mockito.<List>mock(List.class))
                .setCharacter(XO.O,0,0)
                .setCharacter(XO.O,1,1)
                .setCharacter(XO.O,2,2);
        verify(win).win(XO.O);
    }

    @Test
    public void testGet(){

        Assertions.assertEquals(XO.X,
                new Model(3,
                        mock(List.class))
                    .setCharacter(XO.X,0,1)
                    .get(0,1)
        );
    }

    @Test
    public void testSetCharacter(){
        Model model = new Model(3,new ArrayList<>());
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
        new Model(3,list).addListenerStates(states);
        Assertions.assertEquals(list.get(0),states);
    }


}