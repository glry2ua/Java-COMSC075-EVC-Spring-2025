// Yanina Miller
// EVC COMSC075 Spring 2025
// Week 7 Discussion Array Example

import java.util.Random;
import java.util.Scanner;

public class tiktactoecpptojavaYM {
    private static char[][] board = new char[3][3];
    private static char playerSymbol, computerSymbol;
    private static int playerScore = 0, computerScore = 0;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Choose your symbol (X or O): ");
        playerSymbol = scanner.next().toUpperCase().charAt(0);
        computerSymbol = (playerSymbol == 'X') ? 'O' : 'X';

        while (true) {
            initializeBoard();
            while (true) {
                printBoard();
                playerMove();
                if (checkWin(playerSymbol)) {
                    printBoard();
                    System.out.println("You win!");
                    playerScore++;
                    break;
                } else if (checkDraw()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                computerMove();
                if (checkWin(computerSymbol)) {
                    printBoard();
                    System.out.println("Computer wins!");
                    computerScore++;
                    break;
                } else if (checkDraw()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
            }
            System.out.println("Score: Player " + playerScore + " - Computer " + computerScore);
            System.out.print("Play again? (Press 'E' to exit or any key to continue): ");
            if (scanner.next().equalsIgnoreCase("E")) break;
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private static void playerMove() {
        int row, col;
        while (true) {
            System.out.print("Enter your move (row): ");
            row = scanner.nextInt() - 1;
            System.out.print("Enter your move (col): ");
            col = scanner.nextInt() - 1;
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = playerSymbol;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void computerMove() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = computerSymbol;
                    if (checkWin(computerSymbol)) return;
                    board[i][j] = ' ';
                }
            }
        }
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board[row][col] != ' ');
        board[row][col] = computerSymbol;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    private static boolean checkDraw() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }
}