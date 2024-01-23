#include <iostream>
using namespace std;


void printBoard(int length, string arr[][10]);

void playerMove(int size, string arr[10][10], char symbol) {
    int row, col;
    cout << "Enter the coordinates (X Y) to set to '" << symbol << "': ";
    cin >> col >> row;

    if (row - 1 >= 0 && row -1 < size && col - 1 >= 0 && col - 1 < size) {
        arr[row - 1][col - 1] = symbol;
    } else {
        cout << "Invalid coordinates. Exiting program." << endl;
    }
}

void changeTurn(char symbol){
    if (symbol == 'X'){
        symbol = 'O';
    }
    if (symbol == 'O'){
        symbol = 'X';
    }
}
    

int main() {
    int length = 0;
    bool invalidLength = true;
    int winCondition = 3;
    char symbol = 'X';
    bool playing = true;
    
    while (invalidLength) {
        cout << "Enter Board Length:" << endl;
        cin >> length;

        if (length < 3 || length > 10) {
            cout << "Invalid Board Length. Enter a value between 3 and 10." << endl;
        } else {
            invalidLength = false;
        }
    }
    invalidLength = true;
     while (invalidLength) {
        cout << "Enter Ammount in a row needed to win:" << endl;
        cin >> winCondition;

        if (winCondition < 3 || winCondition > length) {
            cout << "Invalid win condition Length. Enter a value between 3 and " << length << "." << endl;
        } else {
            invalidLength = false;
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
    playerMove(length, arr, symbol);
    changeTurn(symbol);
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