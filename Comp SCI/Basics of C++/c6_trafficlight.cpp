//C6 Traffic Light
//Ryan KS

#include <iostream>
#include <thread>
#include <chrono>

using namespace std;

int main() {
    
    while (true) {
        //green for 15 seconds
        cout << "GREEN" << endl;
        this_thread::sleep_for(std::chrono::seconds(15));

        //yellow for 3 seconds
        cout << "YELLOW" << endl;
        this_thread::sleep_for(std::chrono::seconds(3));
        
        //red for 30 seconds
        cout << "RED" << endl;
        this_thread::sleep_for(std::chrono::seconds(30));

    }

}
