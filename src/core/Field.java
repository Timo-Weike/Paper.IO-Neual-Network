package core;

import java.util.*;

/**
 * Created by timo on 18.05.17.
 */
public class Field {

    private int xSize;
    private int ySize;

    private CellState[][] cells;


    public Field(int xSize, int ySize){
        this.xSize = xSize;
        this.ySize  = ySize;
        cells = new CellState[xSize][ySize];
    }

    public int getxSize(){return this.xSize;}
    public int getySize(){return this.ySize;}

    public void setPlayer(IPlayer p, int pX, int pY) {

    }

    public CellState getCellState(int pX, int pY) {
        if(0 <= pX && pX < xSize && 0 <= pY && pY < ySize){
            return cells[pX][pY];
        } else {
            return new CellState(State.border, null);
        }
    }
}
