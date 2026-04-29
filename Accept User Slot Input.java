import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToeApp
 * UC3 - Accept User Slot Input (1–9)
 */
public class TicTacToeApp {

    static char[][] board = new char[3][3];
    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;

    public static void main(String[] args) {

        initializeBoard();
        performToss();
        printBoard();

        int slot = getUserSlotInput();   // UC3
        System.out.println("You selected slot: " + slot);
    }

    // UC1
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC2
    static void performToss() {
        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Player " + currentPlayer + " starts!");
    }

    // UC1 display
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 🔥 UC3 METHOD (focus here)
    static int getUserSlotInput() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter slot (1–9): ");
        int slot = input.nextInt();

        return slot;
    }
}