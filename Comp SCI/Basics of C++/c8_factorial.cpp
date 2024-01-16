//C8 factorial
//Ryan KS
#include <iostream>

using namespace std;

int Factorial(int input) { //factorial functiopn
    if (input < 0) {
        cout << "Please enter a positive number." << endl;
        return 0;
    }
    int factorial = 1;
    for (int i = 1; i <= input; i++) { //calculate factorial
        factorial *= i;
    }
    return factorial;
}

int main() {
    int number;
    cout << "Enter a positive number: " << endl; //input
    cin >> number;
    int factorial = Factorial(number); //calls function
    
    cout << number << " Factorial is " << factorial << endl; // output

        
}
