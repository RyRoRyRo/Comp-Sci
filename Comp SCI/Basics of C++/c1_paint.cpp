//Ryan KS
//C++ C1


#include <iostream>

using namespace std;

int main() {
    cout << "Enter Room Length:" << endl;
    double length;
    cin >> length;
    cout << "Enter Room Width:" << endl;
    double width;
    cin >> width;
    cout << "Enter Room Height:" << endl;
    double height;
    cin >> height;
    cout << "Enter Amount of Area 1 Paint Can will Cover:" << endl;
    double paint;
    cin >> paint;
    cout << "Enter Cost Of 1 Paint Can:" << endl;
    double price;
    cin >> price;
    double area = 2 * (length + width) * height;
    double totalpaint = area / paint;
    double totalprice = totalpaint * price;
    cout << "Total Area: " << area << " | Paint Can Total: " << totalpaint << " | Total Price: " << totalprice << endl;
}
