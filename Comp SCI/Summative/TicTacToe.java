//January 12, 2023
//Summative 2: TicTacToe
//Ryan KS
//Game where you try to get 3 in a row as either X's or O's. Additional features included.

import java.util.Scanner;

public class Main {
    // global variables
    private static String[] board = new String[9];
    private static int[] scores = new int[3];
    private static int turn = 0;
    private static boolean playing = true;
    private static boolean win = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = "X";
        boolean multiplayer= true;
        for (int i = 0; i < 9; i++){ //fill blank board
            board[i] = "-";
        }
        System.out.println("Please select an option: "); //game options
        System.out.println("1. Local-multiplayer: ");
        System.out.println("2. Versus CPU:");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input == 1) {
            multiplayer = true;
        }
        if (input == 2) {
            multiplayer = false;
        }
        clearScreen(); //clear and print board
        printBoard();
        wait(300);
        while (playing) {
            if (turn == 0){ //switches turn symbol
                symbol = "X";
            }
            if (turn == 1){
                symbol = "O";
            }
            if (multiplayer) {
                System.out.println("Player " + (turn + 1) + "'s turn."); //tell players turn
                System.out.println("Enter a board position to place your " + symbol + ": ");
                int position = scanner.nextInt(); //take input
                scanner.nextLine();
                if (!board[position - 1].equals("-")) { //turns input into array position
                    System.out.println("Enter a valid board position."); //if its not a "-" then there must be something there making it an invalid move
                    wait(1000);
                } else {
                    board[position - 1] = symbol;
                    turn = (turn + 1) % 2; //switches turn
                }
            }
            else {
                if (turn == 0) {
                    System.out.println("Enter a board position to place your " + symbol + ": "); //players turn
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    if (!board[position - 1].equals("-")) { //invalid turn checker
                        System.out.println("Enter a valid board position.");
                        wait(1000);
                    } else {
                        board[position - 1] = symbol;
                        turn = (turn + 1) % 2;
                    }
                }
                else { //cpus turn
                    System.out.println("Waiting for CPU...");
                    board[cpuMove()] = "O"; //makes random move
                }
            }
            clearScreen(); //clear and reprint board
            printBoard();
            wait(300);
            playing = checkWin(symbol); //check if player just won
            win = draw(); //check for draw
        }
        wait(200);
        System.out.println("");
        if (win) {
            System.out.println(symbol + "'s Win!"); //announce winner
            if (turn == 1) {
                scores[0]++; //add score
            }
            if (turn == 0) { //switched because turns switch before win is checked
                if (multiplayer) {
                    scores[1]++; //add score
                } else {
                    scores[2]++; //add CPU score
                }
            }
            wait(500);
        }
        else {
            System.out.println("Draw!"); //announce draw
            wait(500);

        }
        System.out.println("Player 1 Wins: " + scores[0] + " | Player 2 Wins: " + scores[1] + " | CPU Wins: " + scores[2]); //play again logic
        System.out.println("Play again? (y / n)");
        String playAgain = scanner.nextLine();
        switch (playAgain.toLowerCase()) {
            case "y" -> {
                playing = true;
                turn = 0;
                win = true;
                main(args); //restart program
                break;
            }
            case "n" -> {
                break; //end program
            }
        }

    }

    private static boolean draw(){ //check for draw
        for (int i = 0; i < 9; i++){
            if (board[i].equals("-")) { //if everything ISNT "-" then its a draw
                return true;
            }
        }
        return false; //if its a draw return FALSE
    }


    private static void printBoard(){ //print board
        System.out.println(board[0] + " " + board[1] + " " + board[2]);
        System.out.println(board[3] + " " + board[4] + " " + board[5]);
        System.out.println(board[6] + " " + board[7] + " " + board[8]);

    }
    private static int cpuMove(){
        wait(700);
        int position = (int)(Math.random() * 9); //pick random move from 0-8
        while (!board[position].equals("-")) { //redoes it if invalid
            position = (int)(Math.random() * 9);
        }
        wait(1000);
        turn = (turn + 1) % 2; //switches turn
        return position;
    }
    public static boolean checkWin(String symbol) { //check for win logic
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
        return draw();
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
