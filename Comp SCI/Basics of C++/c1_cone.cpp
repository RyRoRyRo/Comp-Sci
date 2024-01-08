//Ryan KS
//C++ C1

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    cout << "Enter Cone Radius:" << endl;
    double r;
    cin >> r;
    cout << "Enter Room Height:" << endl;
    double h;
    cin >> h;


    double area = 3.14 * r * (r + sqrt((h * h) + (r * r)));
    double volume = 3.14 * r * r * (h / 3);
    cout << "Surface Area: " << area << " | Volume: " << volume << endl;
}
