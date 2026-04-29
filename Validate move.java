// UC5 - Validate move
static boolean isValidMove(int row, int col) {

    // Boundary check
    if (row < 0 || row > 2 || col < 0 || col > 2) {
        System.out.println("Invalid position! Out of bounds.");
        return false;
    }

    // Cell check
    if (board[row][col] != '-') {
        System.out.println("Cell already occupied!");
        return false;
    }

    return true;
}
int slot = getUserSlotInput();

int[] pos = convertSlotToIndex(slot);

int row = pos[0];
int col = pos[1];

if (isValidMove(row, col)) {
    System.out.println("Valid move!");
} else {
    System.out.println("Try again.");
}