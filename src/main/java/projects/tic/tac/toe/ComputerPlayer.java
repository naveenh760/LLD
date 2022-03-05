package projects.tic.tac.toe;

import lombok.Builder;

public class ComputerPlayer extends Player{
    MakeMoveStrategy makeMoveStrategy;

    @Builder
    public ComputerPlayer(String symbol, String userName, MakeMoveStrategy makeMoveStrategy) {
        super(symbol, userName);
        this.makeMoveStrategy = makeMoveStrategy;
    }

    @Override
    public void makeMove() {

    }
}
