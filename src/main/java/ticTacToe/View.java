package ticTacToe;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.SneakyThrows;

import java.util.List;

public class View {
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

    @SneakyThrows
    private void init(){
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml_example.fxml"));

        for (int i=0;i<3;i++){
            HBox hBox = new HBox();
            for (int j=0;j<3;j++){
                Button button = new Button();
                int finalI = i;
                int finalJ = j;
                button.setOnAction((e)->{
                    states.start(finalI,finalJ);
                    button.setText(readOnlyModel.get(finalI,finalJ).toString());
//                    button.setDisable(ButtonEnabled.isEnabled());
                });
                hBox.getChildren().add(button);
            }
            vBox.getChildren().add(hBox);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void setDisableButtons(){
        //for (int i=0;i<3;i++) {
        vBox.setDisable(true);
//        List<Node> nodes = vBox.getChildren();
//            for (int j = 0; j < 3; j++) {
//                nodes.get(0).setDisable(true);
//            }
        //}
    }
}
