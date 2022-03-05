package projects.tic.tac.toe;

import lombok.Builder;
import lombok.Getter;

public class HumanPlayer extends Player{
    @Getter User user;

    @Builder
    public HumanPlayer(String symbol, String userName,User user) {
        super(symbol, userName);
        this.user = user;
    }

    @Override
    public void makeMove() {

    }
}
