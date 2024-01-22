#include <iostream>
using namespace std;

void printBoard(int size, string arr[10][10]){
    cout << "Printing Board:\n";
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            cout << "\t" << arr[i][j];
        }
        cout << endl;
    }
}

void playerMove(int size, string arr[10][10]){
    int row, col;
    cout << "Enter the coordinates (row and column) to set to 'X': ";
    cin >> row >> col;

    if (row >= 0 && row < size && col >= 0 && col < size) {
        arr[row][col] = "X";
    } else {
        cout << "Invalid coordinates. Exiting program." << endl;
    }

    
}

int main() {
    int length = 0;
    bool invalidLength = true;
    while (invalidLength) {
    cout << "Enter Board Length:" << endl;
    cin >> length;
    if (length < 3) {
        cout << "Enter a valid Board Length (3-10)" << endl;
    }
    else if (length > 10) {
        cout << "Enter a valid Board Length (3-10)" << endl;
    }
    else {
        invalidLength = false;
    }
    }
    
    string arr[length][length];
    
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; j++) {
            arr[i][j] = "-";
        }
    }
    printBoard(length, arr);
    
    playerMove(length);
    


    return 0;
}


