package ticTacToe;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listener {
    private final Stage stage;
    private final Scene scene;


    public Listener(Stage stage, Scene scene) {
        this.stage = stage;
        this.scene = scene;
    }

    public void attention(String text, String player2Text) {
        stage.setScene(scene);
    }
}
