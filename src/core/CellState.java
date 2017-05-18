package core;

/**
 * Created by timo on 18.05.17.
 */
public class CellState {

    private State stateType;
    private IPlayer associatedPlayer;

    public CellState(State stateType, IPlayer associatedPlayer){
        this.stateType = stateType;
        this.associatedPlayer = associatedPlayer;
    }

    public State getStateType(){
        return stateType;
    }
    public IPlayer getAssociatedPlayer(){
        return this.associatedPlayer;
    }
}
