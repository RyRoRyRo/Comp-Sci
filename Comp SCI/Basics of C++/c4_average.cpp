//Ryan KS
//C++ C4

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int marks;
    int total;
    cout << "Enter the ammount of courses you are in:" << endl;
    int courses;
    cin >> courses;
    for (int i = 0; i < courses; i++){
    cout << "Enter the mark for class " << i + 1 << endl;
    cin >> marks;
    total += marks;
    }
    cout << "Average Grade: " << total/courses << endl;
}
