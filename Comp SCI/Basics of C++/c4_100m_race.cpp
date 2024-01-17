//Ryan KS
//C++ C4 100m Race

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int seconds;
    int distance;
    for (int i = 0; i < 100; seconds++){
    cout << "Enter the distance the runner has covered this second " << endl;
    cin >> distance;
    i += distance;
    }
    cout << "It took the runner " << seconds << " seconds to run 100m." << endl;
}
