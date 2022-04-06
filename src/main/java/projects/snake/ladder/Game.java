package projects.snake.ladder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    int dimension;
    int diceCount;
    Queue<Player> playerList;
    Queue<Player> winnerList;
    Board board;
    public Game(int dimension, int diceCount) {
        this.dimension = dimension;
        this.diceCount = diceCount;
        playerList = new LinkedList<>();
        board = new Board(dimension);
    }

    public void addPlayer(Player p){
        playerList.add(p);
    }

    public void launch(){
         while(playerList.size() != 1){
             Player curPlayer = playerList.poll();
             int diceResult = DiceService.roll(1);
             board.move(curPlayer, diceResult);
             boolean hasWon = board.checkWinner(curPlayer);
             if(hasWon){
                 winnerList.add(curPlayer);
             }
             else{
                 playerList.add(curPlayer);
             }

         }

    }
}
