import java.util.Scanner;

public class Main {
    // global variables
    private static String[] board = new String[9];
    private static int[] scores = new int[3];
    private static int turn = 0;
    private static boolean playing = true;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = "X";
        boolean multiplayer= true;
            for (int i = 0; i < 9; i++){
                board[i] = "-";
            }
        System.out.println("Please select an option: ");
        System.out.println("1. Local-multiplayer: ");
        System.out.println("2. Versus CPU:");
        int input = scanner.nextInt();
        if (input == 1) {
            multiplayer = true;
        }
        if (input == 2) {
            multiplayer = false;
        }
        while (playing) {
                if (turn == 0){
                    symbol = "X";
                }
                if (turn == 1){
                    symbol = "O";
                }
                clearScreen();
                printBoard();
                wait(300);
                if (multiplayer) {
                    System.out.println("Player " + (turn + 1) + "'s turn.");
                    System.out.println("Enter a board position to place your " + symbol + ": ");
                    int position = scanner.nextInt();
                    if (!board[position - 1].equals("-")) {
                        System.out.println("Enter a valid board position.");
                        wait(1000);
                    } else {
                        board[position - 1] = symbol;
                        turn = (turn + 1) % 2;
                    }
                }
                else {
                    if (turn == 0) {
                        System.out.println("Enter a board position to place your " + symbol + ": ");
                        int position = scanner.nextInt();
                        if (!board[position - 1].equals("-")) {
                            System.out.println("Enter a valid board position.");
                            wait(1000);
                        } else {
                            board[position - 1] = symbol;
                            turn = (turn + 1) % 2;
                        }
                    }
                    else {
                        System.out.println("Waiting for CPU...");
                        board[cpuMove()] = "O";
                    }
                }
                playing = checkWin(symbol);
            }
        System.out.println(symbol + "'s Win!");
        if (turn == 0) {
            scores[0]++;
        }
        if (turn == 1) {
            if (multiplayer){
                scores[1]++;
            }
            else {
                scores[2]++;
            }
        }
        System.out.println("Player 1 Wins: " + scores[0] + " Player 2 Wins: " + scores[1] + " CPU Wins: " + scores[3]);
        System.out.println("Play again? (y/n)");
        String playagain = scanner.nextLine();
        switch (playagain.toLowerCase()) {
            case "y" -> main(args); //restart program
            case "n" -> {
                //end program
            }
        }
    }

    private static boolean draw(){
        for (int i = 0; i < 9; i++){
            if (board[i].equals("-")) {
                return false;
            }
        }
        return true;
    }


    private static void printBoard(){
        System.out.println(board[0] + " " + board[1] + " " + board[2]);
        System.out.println(board[3] + " " + board[4] + " " + board[5]);
        System.out.println(board[6] + " " + board[7] + " " + board[8]);

    }
    private static int cpuMove(){
        wait(700);
        int position = (int)(Math.random() * 9);
        if (!board[position].equals("-")) {
            position = (int)(Math.random() * 9);
            wait(1000);
        }
        turn = (turn + 1) % 2;
        return position;
    }
    public static boolean checkWin(String symbol) {
        if (board[0].equals(symbol) && board[1].equals(symbol) && board[2].equals(symbol)) {
            return false;
        }
        if (board[3].equals(symbol) && board[4].equals(symbol) && board[5].equals(symbol)) {
            return false;
        }
        if (board[6].equals(symbol) && board[7].equals(symbol) && board[8].equals(symbol)) {
            return false;
        }
        if (board[0].equals(symbol) && board[3].equals(symbol) && board[6].equals(symbol)) {
            return false;
        }
        if (board[1].equals(symbol) && board[4].equals(symbol) && board[7].equals(symbol)) {
            return false;
        }
        if (board[2].equals(symbol) && board[5].equals(symbol) && board[8].equals(symbol)) {
            return false;
        }
        if (board[0].equals(symbol) && board[4].equals(symbol) && board[8].equals(symbol)) {
            return false;
        }
        if (board[2].equals(symbol) && board[4].equals(symbol) && board[6].equals(symbol)) {
            return false;
        }
        return true;
    }
    private static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println(); //prints 30 blank lines to clear screen
        }
    }

    private static void wait(int sec) {
        try {
            Thread.sleep(sec); //wait
        } catch (InterruptedException e) {
            e.printStackTrace(); //catch case
        }
    }
}
