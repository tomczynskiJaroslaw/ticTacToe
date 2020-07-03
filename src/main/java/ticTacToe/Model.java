package ticTacToe;

import ticTacToe.WinMethod.*;

import java.util.Arrays;
import java.util.List;

public class Model {
    private final int COUNT = 3;

    private final List<States> stets;

    private XO[][] xos;

    private WinMethods winMethods;

    public Model(List<States> stets) {
        this.stets = stets;
        prepareXOS();

    }

    private void prepareXOS() {
        xos = new XO[COUNT][COUNT];
        for (int i=0;i<COUNT;i++){
            for (int j=0;j<COUNT;j++){
                xos[i][j]=XO.EMPTY;
            }
        }
    }

    public XO get(int x,int y){
        return xos[y][x];
    }

    public Model setCharacter(XO xo, int x, int y) {
        if (xos[y][x]==XO.EMPTY){
            xos[y][x]=xo;
            System.out.println(winMethods);
            if (!winMethods.isWin(x,y,xo))
                stets.forEach(States::next);
        }
        return this;
    }



    public void addListenerStates(States... stets) {
        this.stets.addAll(Arrays.asList(stets));
    }

    public void addListenerWinMethods(WinMethods winMethods) {
        if (this.winMethods==null) this.winMethods=winMethods; else throw  new RuntimeException("two listeners but allowed only one");
    }
}
