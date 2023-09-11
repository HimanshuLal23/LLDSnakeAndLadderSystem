import services.Game;

public class Main {
    public static void main(String []args) {
        Game game = new Game();
        for(int i=1;i<=2;i++) {
            game.createUsers(i);
        }
        game.setMovers();
        try {
            game.startGame();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
