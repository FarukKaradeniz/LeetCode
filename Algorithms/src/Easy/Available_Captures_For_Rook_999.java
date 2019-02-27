package Easy;

// https://leetcode.com/problems/available-captures-for-rook/
public class Available_Captures_For_Rook_999 {

    public static int numRookCaptures(char[][] board) {
        int num = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    num += canRookCapturePawn(i, j, board);
                }
            }
        }
        return num;
    }

    public static int canRookCapturePawn(int row, int column, char[][] board) {
        int count = 0;
        int j = column - 1;
        // check left
        while ((j > -1) && (board[row][j] == '.')) {
            j--;
        }
        if ((j > -1) && (board[row][j] == 'p')) {
            count++;
        }
        // check right
        j = column + 1;
        while ((j < board[row].length) && (board[row][j] == '.')) {
            j++;
        }
        if ((j < board[row].length) && (board[row][j] == 'p')) {
            count++;
        }
        // check up
        j = row - 1;
        while ((j > -1) && (board[j][column] == '.')) {
            j--;
        }
        if ((j > -1) && (board[j][column] == 'p')) {
            count++;
        }
        // check down
        j = row + 1;
        while ((j < board.length) && (board[j][column] == '.')) {
            j++;
        }
        if ((j < board.length) && (board[j][column] == 'p')) {
            count++;
        }

        return count;
    }

}
