package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Board board;
    private List<User> users;
    Random random = new Random();

    public Game() {
        board = new Board();
        users = new ArrayList<>();
    }

    public void setMovers() {
        for (int i = 0; i < 10; ) {
            int start = random.nextInt(100);
            int end = random.nextInt(100);
            Cell c1;
            c1 = getCell(start);
            if (c1.getStaticMovers() != null) {
                continue;
            }
            if (start > end) {
                c1.add(new Snakes(end, start));
                i++;
            } else if (start < end) {
                c1.add(new Ladder(start, end));
                i++;
            }
        }
    }

    private Cell getCell(int pos) {
        return board.getCell(pos);
    }

    public void createUsers(int id) {
        users.add(new User(id, 0));
    }

    public void startGame() throws Exception{
        boolean winner = false;
        int player = 0;
        int totalPlayers = users.size();
        if(totalPlayers<=1) {
            throw new Exception("The game has to be played with 2 or more users");
        }
        while (winner == false) {
            int numberOnDice = random.nextInt(7);
            int pos = users.get(player).getPosition();
            if (pos + numberOnDice <= 100) {
                pos += numberOnDice;
                Cell currentCell = getCell(pos);
                if (currentCell.getStaticMovers() != null) {
                    pos = currentCell.getEnd();
                }
                users.get(player).setPosition(pos);
                if (users.get(player).getPosition() == 100) {
                    System.out.println("Congrats!! User " + (player+1) + " has won the game");
                    winner = true;
                }
            }
            player = (player + 1) % totalPlayers;
        }
    }
}
