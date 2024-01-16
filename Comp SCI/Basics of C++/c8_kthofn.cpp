//C8 Digit Counter
//Ryan KS
#include <iostream>
#include <cmath>
using namespace std;

int numDigits(int n, int k) { //function
//get kth digit of n
    return (n / (int)pow(10, k)) % 10;
}

int main() {
    int n;
    int k;
    int digit;
    cout << "Enter value for N: " << endl;
    cin >> n;
    cout << "Enter value for K: " << endl;
    cin >> k;
    digit = numDigits(n, k);
    cout << "The " << k << "th digit of " << n << " is " << digit << endl;

}
