//C7 Array Shifter
//Ryan KS
#include <iostream>

using namespace std;

int main() {
        int Array[8];
        int ShiftedArray[8];
        int Ashift = 3;
        cout << "Please enter a number to shift by: " << endl;
        cin >> Ashift;

        cout << "Please enter 8 Numbers: " << endl;
        for (int i = 0; i < 8; i++) {
            cin >> Array[i]; //make array
        }
        for (int i = 0; i < 8; i++) {
            ShiftedArray[(i + Ashift) % 8] = Array[i]; //shift array
        }
        cout << " Old Array: ";
        for (int i = 0; i < 8; i++) {
            cout << Array[i] << " "; //print original array
        }
        cout << " New Array: ";

        for (int i = 0; i < 8; i++) {
            cout << ShiftedArray[i] << " "; //print new array 
        }
}
