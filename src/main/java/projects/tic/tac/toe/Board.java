package projects.tic.tac.toe;

public class Board {
    private int n;
    private String[][] matrix;

    public Board(int n) {
        this.n = n;
        matrix = new String[n][n];
    }

    public void insertSymbolAtPosition(int i, int j ,String symbol){
        matrix[i][j] = symbol;
    }

    public String getSymbolAtPosition(int i, int j){
        return matrix[i][j];
    }
}
