#include <iostream>
#include <vector>
#include <thread>
#include <chrono>

std::vector<std::string> board(9);
std::vector<int> scores(3);
int turn = 0;
bool playing = true;
bool win = true;

void clearScreen() {
    for (int i = 0; i < 30; i++) {
        std::cout << std::endl; //prints 30 blank lines to clear screen
    }
}

void wait(int sec) {
    std::this_thread::sleep_for(std::chrono::milliseconds(sec)); //wait
}

void printBoard() {
    std::cout << board[0] + " " + board[1] + " " + board[2] << std::endl;
    std::cout << board[3] + " " + board[4] + " " + board[5] << std::endl;
    std::cout << board[6] + " " + board[7] + " " + board[8] << std::endl;
}

int cpuMove() {
    wait(700);
    int position = (int)(std::rand() % 9);
    while (board[position] != "-") {
        position = (int)(std::rand() % 9);
    }
    wait(1000);
    turn = (turn + 1) % 2;
    return position;
}

bool draw() {
    for (int i = 0; i < 9; i++) {
        if (board[i] == "-") {
            return true;
        }
    }
    return false; //if its a draw return FALSE
}

bool checkWin(std::string symbol) {
    if (board[0] == symbol && board[1] == symbol && board[2] == symbol) {
        return false;
    }
    if (board[3] == symbol && board[4] == symbol && board[5] == symbol) {
        return false;
    }
    if (board[6] == symbol && board[7] == symbol && board[8] == symbol) {
        return false;
    }
    if (board[0] == symbol && board[3] == symbol && board[6] == symbol) {
        return false;
    }
    if (board[1] == symbol && board[4] == symbol && board[7] == symbol) {
        return false;
    }
    if (board[2] == symbol && board[5] == symbol && board[8] == symbol) {
        return false;
    }
    if (board[0] == symbol && board[4] == symbol && board[8] == symbol) {
        return false;
    }
    if (board[2] == symbol && board[4] == symbol && board[6] == symbol) {
        return false;
    }
    return draw();
}

int main() {
    std::string symbol = "X";
    bool multiplayer = true;
    for (int i = 0; i < 9; i++) {
        board[i] = "-";
    }
    std::cout << "Please select an option: " << std::endl;
    std::cout << "1. Local-multiplayer: " << std::endl;
    std::cout << "2. Versus CPU:" << std::endl;
    int input;
    std::cin >> input;
    std::cin.ignore();
    if (input == 1) {
        multiplayer = true;
    }
    if (input == 2) {
        multiplayer = false;
    }
    while (playing) {
        if (turn == 0) {
            symbol = "X";
        }
        if (turn == 1) {
            symbol = "O";
        }
        clearScreen();
        printBoard();
        wait(300);
        if (multiplayer) {
            std::cout << "Player " + std::to_string(turn + 1) + "'s turn." << std::endl;
            std::cout << "Enter a board position to place your " + symbol + ": " << std::endl;
            int position;
            std::cin >> position;
            std::cin.ignore();
            if (board[position - 1] != "-") {
                std::cout << "Enter a valid board position." << std::endl;
                wait(1000);
            } else {
                board[position - 1] = symbol;
                turn = (turn + 1) % 2;
            }
        } else {
            if (turn == 0) {
                std::cout << "Enter a board position to place your " + symbol + ": " << std::endl;
                int position;
                std::cin >> position;
                std::cin.ignore();
                if (board[position - 1] != "-") {
                    std::cout << "Enter a valid board position." << std::endl;
                    wait(1000);
                } else {
                    board[position - 1] = symbol;
                    turn = (turn + 1) % 2;
                }
            } else {
                std::cout << "Waiting for CPU..." << std::endl;
                board[cpuMove()] = "O";
            }
        }
        playing = checkWin(symbol);
        win = draw();
    }

    if (win) {
        std::cout << symbol + "'s Win!" << std::endl;
        if (turn == 1) {
            scores[0]++;
        }
        if (turn == 0) { //switched because turns switch before win is checked
            if (multiplayer) {
                scores[1]++;
            } else {
                scores[2]++;
            }
        }
        wait(500);
    } else {
        std::cout << "Draw!" << std::endl;
        wait(500);
    }
    std::cout << "Player 1 Wins: " + std::to_string(scores[0]) + " | Player 2 Wins: " + std::to_string(scores[1]) + " | CPU Wins: " + std::to_string(scores[2]) << std::endl;
    std::cout << "Play again? (y / n)" << std::endl;
    std::string playAgain;
    std::cin >> playAgain;
    std::cin.ignore();
    if (playAgain == "y") {
        playing = true;
        turn = 0;
        win = true;
        main(); //restart program
    } else if (playAgain == "n") {
        //end program
    }
}
