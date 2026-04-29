import java.util.Random;

// UC7 - Computer random move
static void computerMove() {

    Random random = new Random();

    while (true) {

        int slot = random.nextInt(9) + 1; // 1–9

        int[] pos = convertSlotToIndex(slot);

        int row = pos[0];
        int col = pos[1];

        if (isValidMove(row, col)) {

            char computerSymbol = (currentPlayer == 1) ? player2Symbol : player1Symbol;

            placeMove(row, col, computerSymbol);

            System.out.println("Computer chose slot: " + slot);

            break; // exit loop once valid move is made
        }
    }
}// After player move
printBoard();

// Computer turn
computerMove();

printBoard();