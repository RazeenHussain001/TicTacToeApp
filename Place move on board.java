// UC6 - Place move on board
static void placeMove(int row, int col, char symbol) {
    board[row][col] = symbol;
}
int slot = getUserSlotInput();

int[] pos = convertSlotToIndex(slot);

int row = pos[0];
int col = pos[1];

char currentSymbol = (currentPlayer == 1) ? player1Symbol : player2Symbol;

if (isValidMove(row, col)) {

    placeMove(row, col, currentSymbol);   // UC6

    printBoard();

} else {
    System.out.println("Invalid move. Try again.");
}