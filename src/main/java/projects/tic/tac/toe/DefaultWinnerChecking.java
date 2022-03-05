package projects.tic.tac.toe;

public class DefaultWinnerChecking implements WinnerCheckingStrategy{
    @Override
    public boolean checkIsWon(Player currentPlayer) {
        return false;
    }
}
