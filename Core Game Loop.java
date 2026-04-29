boolean gameRunning = true;

while (gameRunning) {

    // Player move
    int slot = getUserSlotInput();
    int[] pos = convertSlotToIndex(slot);

    int row = pos[0];
    int col = pos[1];

    char playerSymbol = (currentPlayer == 1) ? player1Symbol : player2Symbol;

    if (!isValidMove(row, col)) {
        System.out.println("Invalid move. Try again.");
        continue;
    }

    placeMove(row, col, playerSymbol);
    printBoard();

    // Check win or draw
    if (checkWin(playerSymbol)) {
        System.out.println("Player wins!");
        break;
    }

    if (isBoardFull()) {
        System.out.println("Game is a draw!");
        break;
    }

    // Computer move
    computerMove();
    printBoard();

    char computerSymbol = (currentPlayer == 1) ? player2Symbol : player1Symbol;

    if (checkWin(computerSymbol)) {
        System.out.println("Computer wins!");
        break;
    }

    if (isBoardFull()) {
        System.out.println("Game is a draw!");
        break;
    }
}
static boolean isBoardFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == '-') {
                return false;
            }
        }
    }
    return true;
}
static boolean checkWin(char symbol) {

    // Rows
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == symbol &&
            board[i][1] == symbol &&
            board[i][2] == symbol)
            return true;
    }

    // Columns
    for (int j = 0; j < 3; j++) {
        if (board[0][j] == symbol &&
            board[1][j] == symbol &&
            board[2][j] == symbol)
            return true;
    }

    // Diagonals
    if (board[0][0] == symbol &&
        board[1][1] == symbol &&
        board[2][2] == symbol)
        return true;

    if (board[0][2] == symbol &&
        board[1][1] == symbol &&
        board[2][0] == symbol)
        return true;

    return false;
}
