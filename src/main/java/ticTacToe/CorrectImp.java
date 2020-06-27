package ticTacToe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CorrectImp implements Correct {
    private List<Correct> list;

    public CorrectImp(List<Correct> list) {
        this.list = list;
    }

    public void addActionListener(Correct... state){
        this.list.addAll(Arrays.asList(state));
        System.out.println("d");
    }

    @Override
    public void correct() {
        list.forEach(Correct::correct);
        System.out.println("g");
    }
}
