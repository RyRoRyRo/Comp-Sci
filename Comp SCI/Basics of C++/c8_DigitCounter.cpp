//C8 Digit Counter
//Ryan KS
#include <iostream>

using namespace std;

int numDigits() { //function
    int number;
    int digits;
    cout << "Enter a number: " << endl; //input
    cin >> number;
    while (number != 0) { //count digits
        number = number / 10;
        digits++;
    }
    return digits;
}

int main() {
    int answer = numDigits();
    cout << "That number has " << answer << " Digits." << endl; //output

        
}
