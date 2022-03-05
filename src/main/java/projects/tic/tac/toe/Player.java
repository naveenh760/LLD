package projects.tic.tac.toe;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public abstract class Player {
    @Getter String symbol;
    @Getter String userName;

    public Player(String symbol, String userName) {
        this.symbol = symbol;
        this.userName = userName;
    }

    public abstract void makeMove();
}
