package ticTacToe;

public class ReadOnlyModel {
    private final Model model;

    public ReadOnlyModel(Model model) {
        this.model = model;
    }

    public XO get(int x,int y){
        return model.get(x,y);
    }
}
