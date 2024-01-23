#include <iostream>
#include <thread>
#include <chrono>
using namespace std;


void printBoard(int length, string arr[][10]);

void playerMove(int size, string arr[10][10], char symbol, bool CPU) {
    bool invalidCords = true;
    while (invalidCords) {
        int row, col;
        if (CPU == false) {
        cout << "Enter the coordinates (X Y) to set to '" << symbol << "': ";
        cin >> col >> row;
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (row - 1 >= 0 && row -1 < size && col - 1 >= 0 && col - 1 < size) {
            arr[row - 1][col - 1] = symbol;
            invalidCords = false;
   
        } 
        else {
            cout << "Invalid coordinates." << endl;

            }
        }
        else {
            if (symbol == 'X') {
                cout << "Enter the coordinates (X Y) to set to 'X': ";
                cin >> col >> row;
                cin.clear(); 
                cin.ignore(10000, '\n');
                if (row - 1 >= 0 && row -1 < size && col - 1 >= 0 && col - 1 < size) {
                    arr[row - 1][col - 1] = symbol;
                    invalidCords = false;
                }
                
                else {
                    cout << "Invalid coordinates." << endl;
                    }
                }
            if (symbol == 'O') {
                cout << "Waiting for CPU..." << endl;
                this_thread::sleep_for(std::chrono::seconds(2));
                std::srand(std::time(nullptr));
                row = (std::rand() % size);
                col = (std::rand() % size);
                while (invalidCords){
                    if (arr[row][col] != "-") {
                        row = (std::rand() % size);
                        col = (std::rand() % size);
                    }
                    else {
                        arr[row][col] = "O";
                        invalidCords = false;
                    }
                }
                
            }
        }
    }
}


char changeTurn(char symbol){
    if (symbol == 'X'){
        return 'O';
    }
    if (symbol == 'O'){
        return 'X';
    }
}
    

bool Draw(string arr[10][10], int size) {
    bool draw = true;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (arr[i][j] == "-") {
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

bool winCheck(string arr[10][10], int size, char symbol, int winLength) {
    for (int i = 0; i < size; i++) {
        int winCon = 0;
        for (int j = 0; j < size; j++) { //i + X, j = Y
            if (arr[i][j] == symbol) {
                for (int n = 0; n < winLength; n++) {
                    if (arr[i + 1][j] == symbol) {
                        winCon++;
                        if (winCon == winLength){
                            break;
                            return true;
                        }
                        
                    }
                }
            }
        }
    }
}
int main() {
    int length = 0;
    bool invalidInput = true;
    int winCondition = 3;
    char symbol = 'X';
    bool playing = true;
    bool singleplayer = false;
    int input;
    bool draw;
    
    while (invalidInput) {
        cout << "Enter Board Size:" << endl;
        cin >> length;
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (length < 3 || length > 10) {
            cout << "Invalid Board Size. Enter a value between 3 and 10." << endl;
        } else {
            invalidInput = false;
        }
    }
    invalidInput = true;
     while (invalidInput) {
        cout << "Enter Ammount in a row needed to win:" << endl;
        cin >> winCondition;
        cin.clear(); 
        cin.ignore(10000, '\n');
        if (winCondition < 3 || winCondition > length) {
            cout << "Invalid win condition Length. Enter a value between 3 and " << length << "." << endl;
        } else {
            invalidInput = false;
        }
    }
    invalidInput = true;
     while (invalidInput) {
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

    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; j++) {
            arr[i][j] = "-";
        }
    }
    
    
    
    while (playing) {
    printBoard(length, arr);
    playerMove(length, arr, symbol, singleplayer);
    symbol = changeTurn(symbol);
    draw = Draw(arr, length);
        if (draw){
            playing = false;
            cout << "Draw!" << endl;
        }
    }
    
    return 0;
}

void printBoard(int length, string arr[][10]) {
    cout << "Printing Board:\n";
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; j++) {
            cout << "\t" << arr[i][j];
        }
        cout << endl;
    }
}
