class Solution {
    public void gameOfLife(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                int live = countLiveNebiours(board, row, col);
                if (board[row][col] == 1) {
                    if (live < 2 || live > 3) {
                        board[row][col] = 2;
                    }
                } else if (board[row][col] == 0) {
                    if (live == 3)
                        board[row][col] = 3;
                }
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 2) {
                    board[row][col] = 0;
                } else if (board[row][col] == 3) {
                    board[row][col] = 1;
                }
            }

        }
    }
    private int countLiveNebiours(int[][] board, int row, int col) {
    int[][] directions = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
    int count = 0;
    for (int[] dir : directions) {
        int newRow = row + dir[0];
        int newCol = col + dir[1];

        if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
            if (board[newRow][newCol] == 1 || board[newRow][newCol] == 2) {
                count++;
            }
        }
    }
    return count;
}
}
