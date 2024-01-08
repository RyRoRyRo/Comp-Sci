//Ryan KS
//C++ C3


#include <iostream>
#include <cmath>

using namespace std;

int main() {
    cout << "Enter a Value:" << endl;
    double a;
    cin >> a;
    cout << "Enter b Value:" << endl;
    double b;
    cin >> b;
    cout << "Enter c Value:" << endl;
    double c;
    cin >> c;

    double x1 = (-b + sqrt(b * b - 4 * a * c)) / (2 *a);
    double x2 = (-b - sqrt(b * b - 4 * a * c)) / (2 * a);    
    double zeros = b*b - (4 * a * c);
    if (zeros > 0){
        cout << "2 Zeros" << endl;
    }
    else if (zeros == 0){
        cout << "1 Zero" << endl;
    }
    else if (zeros < 0){
        cout << "No Zeros" << endl;
    }
    cout << "Answer(s):" << x1 << ", " << x2 << endl;
}
