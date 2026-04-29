/**
 * UC10 - Detect Draw Condition
 */
static boolean isDraw() {

    // If any cell is empty → not a draw
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == '-') {
                return false;
            }
        }
    }

    return true; // board full → draw
}
if (checkWin(playerSymbol)) {
    System.out.println("Player wins!");
    break;
}

if (isDraw()) {
    System.out.println("Game is a draw!");
    break;
}