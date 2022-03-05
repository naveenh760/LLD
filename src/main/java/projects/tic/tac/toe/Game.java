package projects.tic.tac.toe;

public class Game {
    Board board;
    Player player1;
    Player player2;
    WinnerCheckingStrategy winnerCheckingStrategy;

    public void launch(){
        Player curPlayer = player1;
        while(true){
            curPlayer.makeMove();
            boolean isWon = winnerCheckingStrategy.checkIsWon(curPlayer);
            if(isWon){
                break;
            }
            curPlayer = (curPlayer == player1) ? player2 : player1;
        }

    }

}
