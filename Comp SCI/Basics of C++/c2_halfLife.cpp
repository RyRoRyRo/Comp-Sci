//Ryan KS
//C++ C2


#include <iostream>
#include <cmath>

using namespace std;

int main() {
    cout << "Enter Substance Ammount:" << endl;
    double N;
    cin >> N;
    cout << "Enter Time Passed:" << endl;
    double t;
    cin >> t;
    cout << "Enter Half Life of Substance:" << endl;
    double H;
    cin >> H;

    double NT = N * pow(0.5, t/H);
    cout << "Half Life: " << NT << endl;
}
