package ticTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class ModelTest {
//    @Test
//    public void testSetCharacter(){
//        Assertions.assertFalse(
//                new Model(Mockito.mock(Win.class), mock(Correct.class))
//                        .setCharacter(XO.O,0,0)
//                        .setCharacter(XO.O,1,1)
//                        .setCharacter(XO.O,0,0)
//                        .isCorrect()
//        );
//    }

//    @Test
//    public void testIsWin(){
//        Win win = Mockito.mock(Win.class);
//        Model model = new Model(3)
//                .setCharacter(XO.O,0,0)
//                .setCharacter(XO.O,1,1)
//                .setCharacter(XO.O,2,2);
//        Mockito.verify(win).win(XO.O);
//    }
//
//    @Test
//    public void testIsCorrect(){
//        Correct correct = Mockito.mock(Correct.class);
//        Model model = new Model(3).setCharacter(XO.X,0,0);
//        Mockito.verify(correct).correct();
//        model.setCharacter(XO.X,0,0);
//        Mockito.verify(correct,never()).correct();
//    }
}