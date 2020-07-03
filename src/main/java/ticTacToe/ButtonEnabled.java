package ticTacToe;

public class ButtonEnabled {
    private View view;

    public void disable() {
        view.setDisableButtons();
    }

    public void setView(View view) {
        this.view = view;
    }
}
