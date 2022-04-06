package projects.snake.ladder;

import java.util.Map;

public class Board {
    Map<Integer, BoardEntity> entityMap;
    int dimension;

    public Board(int dimension) {
        this.dimension = dimension;
    }

    public void printBoard(){

    }

    public boolean hasEntity(int position){
        return false;
    }

    int move(Player player, int diceResult){
        return 1;
    }

    public boolean checkWinner(Player curPlayer) {
        return curPlayer.getPosition() == dimension * dimension;
    }
}
