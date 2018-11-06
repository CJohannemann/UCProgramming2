package ttt;

public class TicTacToe {

    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    /**
     * Constructs an empty board.
     */
    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        // Fill with spaces
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" ")) {
            board[i][j] = player;
        }
    }

    public boolean CheckForWinner(String player) {
        return CheckForRowWin(player) || CheckForColumnWin(player) || CheckForDiagonalWin(player);
    }

    private boolean CheckForRowWin(String player) {
        for (int i = 0; i < ROWS; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                System.out.println("1");
                return true;
            }
        }
        return false;
    }

    private boolean CheckForColumnWin(String player) {
        for (int i = 0; i < COLUMNS; i++) {
            if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
            System.out.println("2");
                return true;
            }
        }
        return false;
    }

    private boolean CheckForDiagonalWin(String player) {
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)
                || board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            System.out.println("3");
            return true;
        }
        return false;
    }

    public boolean CheckForTie(String player) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] != null) {
                    return true;
                }
            }
        }
        return false;
    }


    public String toString() {
        String r = "";
        for (int i = 0; i < ROWS; i++) {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++) {
                r = r + board[i][j];
            }
            r = r + "|\n";
        }
        return r;
    }
}
