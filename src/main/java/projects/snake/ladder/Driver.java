package projects.snake.ladder;

public class Driver {

    public static void main(String[] args) {
        Game game = new Game(10,1);
        Player p1 = new Player("ram");
        Player p2 = new Player("sai");
        game.addPlayer(p1);
        game.addPlayer(p2);
        game.launch();
    }
}
