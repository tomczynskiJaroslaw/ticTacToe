package ticTacToe;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.SneakyThrows;

public class View {
    private Scene players;
    private Scene mainScene;
    private final Stage stage;


    public View(Scene players, Scene mainScene, Stage stage) {
        this.players = players;
        this.mainScene = mainScene;
        this.stage = stage;
        init();
    }
    @SneakyThrows
    private void init(){
        FXMLLoader player = new FXMLLoader(getClass().getClassLoader().getResource("fxml_example.fxml"));
        ControllerX controller = player.getController();
//
        Listener listener = new Listener(stage,mainScene);
        controller.setListener(listener);
        stage.setScene(mainScene);
        stage.show();
    }

    public void setDisableButtons(){
//        //for (int i=0;i<3;i++) {
//        vBox.setDisable(true);
////        List<Node> nodes = vBox.getChildren();
////            for (int j = 0; j < 3; j++) {
////                nodes.get(0).setDisable(true);
////            }
//        //}
    }
}
