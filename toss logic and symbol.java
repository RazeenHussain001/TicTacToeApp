import java.util.Random;


public class TicTacToeApp {

    static char[][] board = new char[3][3];

    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;

    public static void main(String[] args) {

        initializeBoard();
        performToss();

        printBoard();
    }

    // Initialize board
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Toss logic
    static void performToss() {

        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println("Player " + currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }

    // Display board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
