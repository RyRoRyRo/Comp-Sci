//C7 Harmonic Mean
//Ryan KS
#include <iostream>

using namespace std;

int main() {
        double Array[8];
        double Harmonic = 0;
        cout << "Please enter 8 Numbers: " << endl; //get 8 number array
        for (int i = 0; i < 8; i++) {
            cin >> Array[i];
        }
        for (int i = 0; i < 8; i++) {
            Harmonic += 1 / Array[i]; //divide
        }
        cout << " Harmonic Mean: " << 8 / Harmonic << endl; //print
        
}
