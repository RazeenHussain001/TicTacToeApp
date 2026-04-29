// UC4 - Convert slot to row & column
static int[] convertSlotToIndex(int slot) {

    int row = (slot - 1) / 3;
    int col = (slot - 1) % 3;

    return new int[]{row, col};
}int slot = getUserSlotInput();

int[] position = convertSlotToIndex(slot);

System.out.println("Row: " + position[0]);
System.out.println("Column: " + position[1]);