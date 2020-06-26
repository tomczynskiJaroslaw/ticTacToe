package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        int count = 3;
        Win win = null;
        Correct correct = null;

        Model model = new Model(count,correct);

        Stetas stetas = new Stetas();

        State stateX = new State(XO.X,model,stetas);
        State stateO = new State(XO.O,model,stetas).setState(stateX);

        stateX.setState(stateO);

        stetas.setState(stateO);

        VBox vBox = new VBox();
        for (int i=0;i<count;i++){
            HBox hBox = new HBox();
            for (int j=0;j<count;j++){
                Button button = new Button();
                int finalI = i;
                int finalJ = j;
                button.setOnAction((e)->{
                    stetas.next(finalI, finalJ);
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
