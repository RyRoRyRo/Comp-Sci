//C6 Coffee Shop
//Ryan KS
#include <iostream>
#include <thread>
#include <chrono>

using namespace std;

int main() {
    char anotherOrder;
    bool ordering = true;
    while (ordering) {
        cout << "Welcome to the Coffee Shop!" << endl;
        cout << "Menu:" << endl;
        cout << "1. Espresso" << endl;
        cout << "2. Latte" << endl;
        cout << "3. Cappuccino" << endl;

        int choice;
        cout << "Enter the number of the coffee you'd like to order: " << endl;
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Preparing your Espresso..." << endl;
                this_thread::sleep_for(chrono::seconds(5));  //wait for order
                cout << "Your Espresso is ready! Enjoy!" << endl;
                break;
            case 2:
                cout << "Preparing your Latte..." << endl;
                this_thread::sleep_for(chrono::seconds(10));  //wait for order
                cout << "Your Latte is ready! Enjoy!" << endl;
                break;
            case 3:
                cout << "Preparing your Cappuccino..." << endl;
                this_thread::sleep_for(chrono::seconds(8));  //wait for order
                cout << "Your Cappuccino is ready! Enjoy!" << endl;
                break;
            default:
                cout << "Invalid choice. Please enter a valid number." << endl;
        }

        cout << "Do you want to place another order? (y/n):" << endl;
        cin >> anotherOrder; //stop if input is n or N
        if (anotherOrder == 'n' || anotherOrder == 'N') {
            ordering = false;
        }
    }

    cout << "Goodbye! Have a great day!" << endl;

}
