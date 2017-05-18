package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Random;

/**
 * Created by timo on 18.05.17.
 */
public class Game {
    //Stadard values
    public static int X_SIZE = 20;
    public static int Y_SIZE = 20;
    public static boolean USE_SEAD = true;
    public static long SEAD = 0x0123456789ABCDEFL; //just some number

    //private field
    private Field field;
    private ArrayList<IPlayer> players;
    private Random random;

    private void init(List<IPlayer> players, int xSize, int ySize){
        random = new Random(USE_SEAD ? SEAD : System.nanoTime());
        field = new Field(xSize, ySize);
        this.players = new ArrayList<IPlayer>(players.size());
        for(int i = 0; i < this.players.size(); i++){
            IPlayer p = players.get(i);
            this.players.add(i, p);

            int pX;
            int pY;
            do {
                pX = random.nextInt() % xSize;
                pY = random.nextInt() % ySize;
            }while(field.getCellState(pX, pY) != null);

            p.setPosition(pX, pY);
            field.setPlayer(p, pX, pY);
        }
    }

    public Game(Collection<IPlayer> players){

    }


}
