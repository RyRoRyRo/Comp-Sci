//C5 Dice Roller
//Ryan KS

#include <iostream>
#include <cmath>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    std::srand(std::time(nullptr)); //random seed
    int die1 = (std::rand() % 6) + 1;
    int die2 = (std::rand() % 6) + 1; //random rolls
    int Total = die1 + die2;
    int Switcher = die1;
    cout << "Die 1: "; //print die 1
    for (int i = 0; i < 3; i++){
    if (i == 1) { //print die 2
        Switcher = die2;
        cout << "Die 2: ";
    }
    if (i == 2) { //print total
        Switcher = Total;
        cout << "Total: ";
    }
    switch (Switcher) {
            //converts to words depending on the value
            case 1:
                cout << "ONE" << endl;
                break;
            
            case 2:
                cout << "TWO" << endl;
                break;
            
            case 3:
                cout << "THREE" << endl;
                break;
            
            case 4:
                cout << "FOUR" << endl;
                break;
            
            case 5:
                cout << "FIVE" << endl;
                break;
            
            case 6:
                cout << "SIX" << endl;
                break;
            
            case 7:
                cout << "SEVEN" << endl;
                break;
            
            case 8:
                cout << "EIGHT" << endl;
                break;
            
            case 9:
                cout << "NINE" << endl;
                break;
            
            case 10:
                cout << "TEN" << endl;
                break;
            
            case 11:
                cout << "ELEVEN" << endl;
                break;
            
            case 12:
                cout << "TWELVE" << endl;
                break;
            
        }
}
}
