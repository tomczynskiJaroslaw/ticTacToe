package ticTacToe;

import javafx.scene.control.Alert;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Win {
    private final ButtonEnabled buttonEnabled;

    public void win(XO o) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "WIN "+o.toString());
        alert.showAndWait();
        buttonEnabled.disable();
    }

}
