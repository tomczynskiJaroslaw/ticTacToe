package ticTacToe;

import javafx.scene.control.Alert;

public class Win {

    public void win(XO o) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "WIN "+o.toString());
        alert.showAndWait();
    }

}
