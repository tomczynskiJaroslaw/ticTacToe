package ticTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import ticTacToe.WinMethod.WinMethod;
import ticTacToe.WinMethod.WinMethods;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class TicTacToe extends Application {


    @Override
    public void start(Stage stage) {
        int count = 3;
        Model model = new Model(new ArrayList<>());
        ReadOnlyModel readOnlyModel = new ReadOnlyModel(model);
        States states = new States(new ArrayList<>());
        ButtonEnabled buttonEnabled = new ButtonEnabled();
        Win win = new Win(buttonEnabled);
        WinMethods winMethods = new WinMethods(new WinMethod[3][3][],readOnlyModel,win);
        State stateX = new State(XO.X,model,states);
        State stateO = new State(XO.O,model,states);
        states.addListener(stateO,stateX);
        model.addListenerStates(states);
        model.addListenerWinMethods(winMethods);
        View view = new View(stage, states, readOnlyModel);
        System.out.println("---");
        buttonEnabled.setView(view);

    }
}
