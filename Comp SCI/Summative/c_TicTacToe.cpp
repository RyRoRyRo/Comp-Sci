//January 22, 2023
//Summative 4: TicTacToe C++
//Ryan KS
//Game where you try to get several in a row as either X's or O's on a customizable grid. Additional features included.
#include <iostream>
#include <thread>
#include <chrono>
using namespace std;


void printBoard(int length, string arr[][10]);

void playerMove(int size, string arr[10][10], char symbol, bool CPU) {
    bool invalidCords = true; //loops if invalid
    while (invalidCords) {
        int row, col;
        if (CPU == false) { //for local multiplayer player
        cout << "Enter the coordinates (X Y) to set to '" << symbol << "': ";
        cin >> col >> row; //takes X and Y cords as input
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (row - 1 >= 0 && row -1 < size && col - 1 >= 0 && col - 1 < size) { //if within constraints of the board
            if (arr[row - 1][col - 1] == "-"){ //if the spot is free
            arr[row - 1][col - 1] = symbol; //place symbol
            invalidCords = false;
            }
            else {
                cout << "Invalid coordinates. Please pick an empty space." << endl; //invalid
            }
        } 
        else {
            cout << "Invalid coordinates." << endl; //invalid

            }
        }
        else { //against CPU
            if (symbol == 'X') { //player logic
                cout << "Enter the coordinates (X Y) to set to 'X': ";
                cin >> col >> row;
                cin.clear(); 
                cin.ignore(10000, '\n');
                if (row - 1 >= 0 && row -1 < size && col - 1 >= 0 && col - 1 < size) {
                    if (arr[row - 1][col - 1] == "-"){
                    arr[row - 1][col - 1] = symbol;
                    invalidCords = false;
                    }
                    else {
                        cout << "Invalid coordinates. Please pick an empty space." << endl;
                    }
                }
                
                else {
                    cout << "Invalid coordinates." << endl;
                    }
                }
            if (symbol == 'O') { //CPU logic
                cout << "Waiting for CPU..." << endl;
                this_thread::sleep_for(std::chrono::seconds(2)); //picks random seed
                std::srand(std::time(nullptr));
                row = (std::rand() % size);
                col = (std::rand() % size);
                while (invalidCords){
                    if (arr[row][col] != "-") { //picks free spot
                        row = (std::rand() % size);
                        col = (std::rand() % size);
                    }
                    else {
                        arr[row][col] = "O";
                        invalidCords = false; //places O on random spot if its free
                    }
                }
                
            }
        }
    }
}


char changeTurn(char symbol){ //changes turn from X -> O and from O -> X
    if (symbol == 'X'){
        return 'O';
    }
    if (symbol == 'O'){
        return 'X';
    }
}
    

bool Draw(string arr[10][10], int size) { //draw game logic
    bool draw = true;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (arr[i][j] == "-") { //if it finds a blank spot its not a draw
                draw = false;
            }
        }
    }
    if (draw) {
        return true;
    }
    else {
        return false;
    }
}

bool winCheck(string arr[10][10], int size, char symbol, int winLength) { //win check logic
    string winChar(1, symbol);
    int winCon = 0;
    for (int i = 0; i < size ; i++) { //counts up by size squared
        for (int j = 0; j < size; j++) { //i + X, j = Y
            if (arr[i][j] == winChar) {
                winCon = 0;
                for (int n = 0; n < winLength; n++) {
                    if (arr[i + n][j] == winChar) { //check up and down
                        winCon++;
                        if (winCon == winLength){
                            return true;
                            break;
                        }
                        
                    }
                }
                winCon = 0;
                for (int n = 0; n < winLength; n++) {
                    if (arr[i][j + n] == winChar) { //check side to side
                        winCon++;
                        if (winCon == winLength){
                            return true;
                            break;
                        }
                        
                    }
                }
                winCon = 0;
                for (int n = 0; n < winLength; n++) {
                    if (arr[i + n][j + n] == winChar) { //cehck up and to the right
                        winCon++;
                        if (winCon == winLength){
                            return true;
                            break;
                        }
                        
                    }
                }
                winCon = 0;
                for (int n = 0; n < winLength; n++) {
                    if (i - n >= 0){
                        if (arr[i - n][j + n] == winChar) { //check down and to the right
                            winCon++;
                            if (winCon == winLength){
                                return true;
                                break;
                            }
                            
                        }
                    }
                }
            }
        }
    }
    return false;
}
int main() { //main game loop
    int length = 0;
    bool invalidInput = true;
    int winCondition = 3;
    char symbol = 'X';
    bool playing = true;
    bool singleplayer = false;
    int input;
    bool draw;
    bool win = false;
    while (invalidInput) { //take board size input
        cout << "Enter Board Size:" << endl;
        cin >> length;
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (length < 3 || length > 10) { //make sure its not too large otherwise the game will break
            cout << "Invalid Board Size. Enter a value between 3 and 10." << endl;
        } else {
            invalidInput = false;
        }
    }
    invalidInput = true;
     while (invalidInput) { //ammount in a row to win
        cout << "Enter Ammount in a row needed to win:" << endl;
        cin >> winCondition;
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (winCondition < 3 || winCondition > length) { //make sure its within the board size
            cout << "Invalid win condition Length. Enter a value between 3 and " << length << "." << endl;
        } else {
            invalidInput = false;
        }
    }
    invalidInput = true;
     while (invalidInput) { //pick single or multiplayer
        cout << "Pick an option:" << endl;
        cout << "1. Local Multiplayer" << endl;
        cout << "2. Versus CPU" << endl;
        cin >> input;
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (input == 1) {
            cout << "Starting local multiplayer game..." << endl;
            singleplayer = false;
            invalidInput = false;
        }
        if (input == 2) {
            cout << "Starting singleplayer game..." << endl;
            singleplayer = true;
            invalidInput = false;
        }
        else {
            cout << "Please pick either 1 or 2." << endl;
        }
    }
    
    
    string arr[10][10];

    for (int i = 0; i < length; i++) { //make 2D array for board 
        for (int j = 0; j < length; j++) {
            arr[i][j] = "-";
        }
    }
    
    
    
    while (playing) { //game loop
    printBoard(length, arr);
    playerMove(length, arr, symbol, singleplayer);
    draw = Draw(arr, length);
    win = winCheck(arr, length, symbol, winCondition);
        if (draw){
            playing = false;
            cout << "Draw!" << endl;
        }
        if (win){
            playing = false;
            printBoard(length, arr);
            cout << symbol << "'s Wins!" << endl;

        }
        symbol = changeTurn(symbol);

    }
    cout << "Play again? ('y' / 'n')" << endl; //play again logic
    string playAgain;
    cin >> playAgain;
    if (playAgain == "Y" || playAgain == "y") {
        main();
    }
    else {
        cout << "Goodbye!" << endl;
    }
    return 0;
}

void printBoard(int length, string arr[][10]) { //print board logic
    cout << "Printing Board:\n";
    for (int i = 0; i < length; i++) { //counts up through length for Y
        for (int j = 0; j < length; j++) { //counts up through length for X for each spot in Y 
            cout << "\t" << arr[i][j];
        }
        cout << endl;
    }
}
