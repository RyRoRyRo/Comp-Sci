//Ryan KS
//C++ C4

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    cout << "Enter a Start Number:" << endl;
    int num;
    cin >> num;
    cout << "Enter a End Number:" << endl;
    int end;
    cin >> end;
    int sum;
    int product = 1;
    for (int i = num; i <= end; i++){
        sum = sum + i;
        product = product * i;
    }
    cout << "Product: " << product << " Sum: " << sum << endl;
}
