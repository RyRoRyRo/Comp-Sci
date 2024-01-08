//Ryan KS
//C++ C3

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    cout << "Enter a Year:" << endl;
    int year;
    cin >> year;

    if (year % 4 == 0){
        cout << "Leap Year" << endl;
    }
    else if (year % 400 == 0 && year % 100 != 0) {
        cout << "Leap Year" << endl;
    }
    else{
        cout << "NOT a leap year" << endl;
    
    }
}
