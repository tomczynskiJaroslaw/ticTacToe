package ticTacToe;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class ControllerX {
    private Listener listener;
    @FXML
    TextField player1;
    @FXML
    TextField player2;

    @FXML
    public void setOnAction(){
        listener.attention(player1.getText(),player2.getText());
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
