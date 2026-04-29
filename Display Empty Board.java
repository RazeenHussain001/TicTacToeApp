
public class TicTacToeApp {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        char[][] board = new char[rows][cols];

        // Initialize board with '-'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }

        // Display board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}