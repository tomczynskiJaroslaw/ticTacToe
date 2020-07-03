package ticTacToe;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
    private Scene scene;
    private final Stage stage;
    private final States states;
    private final ReadOnlyModel readOnlyModel;
    private VBox vBox = new VBox();


    public View(Stage stage, States states, ReadOnlyModel readOnlyModel) {
        this.stage = stage;
        this.states = states;
        this.readOnlyModel = readOnlyModel;
        init();
    }

    private void init() {
        for (int i=0;i<3;i++){
            HBox hBox = new HBox();
            for (int j=0;j<3;j++){
                Button button = new Button();
                int finalI = i;
                int finalJ = j;
                button.setOnAction((e)->{
                    states.start(finalI,finalJ);
                    button.setText(readOnlyModel.get(finalI,finalJ).toString());
                });
                hBox.getChildren().add(button);
            }
            vBox.getChildren().add(hBox);
        }
        vBox.getStylesheets().add("CSS.css");
        stage.setScene(new Scene(vBox,600,600));
        stage.show();
    }

    public void setDisableButtons() {
        vBox.setDisable(true);
    }
}
