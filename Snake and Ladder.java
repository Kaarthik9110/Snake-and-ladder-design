package SystemDesign.SnakeAndLadder;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        Player p1 = new Player("Ram",1);
        Player p2 = new Player("Ravi",2);
        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        Jumper snake1 = new Jumper(25,2);
        Jumper snake2 = new Jumper(99,22);
        List<Jumper> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        Jumper ladder1 = new Jumper(5,35);
        Jumper ladder2 = new Jumper(4,39);
        List<Jumper> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        Map<String,Integer> playersCurrentPosition = new HashMap<>();
        playersCurrentPosition.put("Ram",0);
        playersCurrentPosition.put("Ravi",0);
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,100);
        gb.startGame();
    }
}
