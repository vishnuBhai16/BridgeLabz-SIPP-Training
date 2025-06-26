package Day_5_String;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    enum Choice { ROCK, PAPER, SCISSORS }
    static Random rnd = new Random();
    static Choice computerChoice() {
        return Choice.values()[rnd.nextInt(3)];
    }
    static int winner(Choice player, Choice cpu) {
        if (player == cpu) return 0;
        switch (player) {
            case ROCK:     return cpu == Choice.SCISSORS ? 1 : 2;
            case PAPER:    return cpu == Choice.ROCK     ? 1 : 2;
            case SCISSORS: return cpu == Choice.PAPER    ? 1 : 2;
        }
        return 2;
    }
    static void printStats(int games, int pw, int cw) {
        double pPct = pw * 100.0 / games;
        double cPct = cw * 100.0 / games;
        System.out.printf("%nGames  Player-Wins  CPU-Wins%n");
        System.out.printf("%-6d %-12d %d%n", games, pw, cw);
        System.out.printf("%nWinning %% – Player: %.2f  CPU: %.2f%n", pPct, cPct);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Games to play: ");
        int n = sc.nextInt();
        int playerWins = 0, cpuWins = 0;
        for (int g = 1; g <= n; g++) {
            System.out.print("[r]ock, [p]aper, [s]cissors? ");
            char in = sc.next().toLowerCase().charAt(0);
            Choice player = (in == 'r') ? Choice.ROCK :
                            (in == 'p') ? Choice.PAPER : Choice.SCISSORS;
            Choice cpu    = computerChoice();
            int result = winner(player, cpu);
            System.out.println("CPU chose " + cpu);
            if (result == 0)      System.out.println("Draw!");
            else if (result == 1) { System.out.println("You win!"); playerWins++; }
            else { System.out.println("CPU wins!"); cpuWins++; }
        }
        printStats(n, playerWins, cpuWins);
    }
}

