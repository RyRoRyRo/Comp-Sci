//Ryan KS
//C++ C3

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    cout << "Enter an amount in cents (0-100): " << endl;
    int amount = scanner.nextInt();
    if (amount < 0 || amount > 100) {
        cout << "Invalid input. Please enter an amount between 0 and 100." << endl;
        //if invalid stop everything
    } else {
        int quarters = amount / 25;
        int remainder = amount % 25;
// taking remainders of the devisions in order to calculate how many of the next smallest coin there is
        int dimes = remainder / 10;
        remainder %= 10;

        int nickels = remainder / 5;
        int pennies = remainder % 5;

        cout << "quarters - " << quarters << endl;
        cout << "dimes - " << dimes << endl;
        cout << "nickels - " << nickels << endl;
        cout << "pennies - " << pennies << endl;
        // output
    }
}