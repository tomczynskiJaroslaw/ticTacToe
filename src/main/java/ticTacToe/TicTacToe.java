package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class TicTacToe extends Application {


    @Override
    public void start(Stage stage) {
        int count = 3;
        Win win = new Win();
        Model model = new Model(new ArrayList<>(),win);
        States states = new States(new ArrayList<>());
        State stateX = new State(XO.X,model,states);
        State stateO = new State(XO.O,model,states);
        states.addListener(stateO,stateX);
        model.addListenerStates(states);


        VBox vBox = new VBox();
        for (int i=0;i<count;i++){
            HBox hBox = new HBox();
            for (int j=0;j<count;j++){
                Button button = new Button();
                int finalI = i;
                int finalJ = j;
                button.setOnAction((e)->{
                    states.start(finalI,finalJ);
                    button.setText(model.get(finalI,finalJ).toString());
                });
                hBox.getChildren().add(button);
            }
            vBox.getChildren().add(hBox);
        }
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();



    }
}
