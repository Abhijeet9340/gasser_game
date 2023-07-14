import java.util.Scanner;
import java.util.*;

class Gusser {
    int gussNum;

    int guessingNumber() {
        System.out.println("GUSSER! kindly guess the Number");
        Scanner scanner = new Scanner(System.in);

        gussNum = scanner.nextInt();
        return gussNum;
    }
}

class Player {
    int gussNum;

    int guessingNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("player guess the Number");
        gussNum = scanner.nextInt();
        return gussNum;
    }

}

class Umpire {
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromGusser;

    void collectNumFromGusser() {
        Gusser g = new Gusser();
        numFromGusser = g.guessingNumber();
    }

    void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNum();
        numFromPlayer2 = p1.guessingNum();
        numFromPlayer3 = p1.guessingNum();

    }

    void compare() {
        if (numFromGusser == numFromPlayer1) {
            if (numFromPlayer1 == numFromPlayer2 && numFromPlayer1 == numFromPlayer3) {
                System.out.println("all players wins");
            } else if (numFromPlayer1 == numFromPlayer2) {
                System.out.println("player 1and player 2 are winners");
            } else if (numFromPlayer1 == numFromPlayer3) {
                System.out.println("player 1and player 3 are winners");
            } else {
                System.out.println("player1 WINS");
            }

        } else if (numFromGusser == numFromPlayer2) {
            if (numFromPlayer2 == numFromPlayer3) {
                System.out.println("player 2and player 3 are winners");
            } else {
                System.out.println("player2 WINS");
            }
        } else if (numFromGusser == numFromPlayer3) {
            System.out.println("player3 WINS");
        } else {
            System.out.println("none WINS");
        }
    }
}

public class Play {

    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGusser();
        u.collectNumFromPlayer();
        u.compare();

    }

}
