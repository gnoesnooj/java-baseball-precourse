package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Game game = new Game();

        try {
            do {
                int[] answer = computer.generateAnswer();
                game.tryAnswer(answer);
            }
            while (game.startGame());
        }
        catch(IllegalArgumentException e){
            System.exit(0);
        }
    }
}
