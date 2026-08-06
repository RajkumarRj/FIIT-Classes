#include <iostream>
using namespace std;

// polymorphism => many forms (method)

// same method name but different in parameter size
// method overloading (compile-time)

// method overriding (run-time)

class Arithmetic{
    public:
        void add(int a , int b){
            cout<<"Method 1"<<endl;
            cout<<a+b<<endl;
        }
        void add(int a, int b, int c){
            cout<<"Method 2"<<endl;
            cout<<a+b+c<<endl;
        }
};

class Payment{
    public:
        void pay(){
            cout<<"Payment paid sucessfully"<<endl;
        }
};

class UPI : public Payment{
    public:
        void pay(){
            cout<<"Payment paid using UPI"<<endl;
        }
};


// coffee brewing machine 

class Coffee{
    public:
       virtual  void sugar() = 0;
       virtual void milk() = 0;
};

class coffeeButton : public Coffee{
    public:
        void sugar(){
            cout<<"Sugar added"<<endl;
        }
        void milk(){
            cout<<"Milk added"<<endl;
        }
};

int main(){

    coffeeButton button;
    button.sugar();

    UPI upi;
    upi.pay();

    Payment obj;
    obj.pay();




    // Arithmetic arith;

    // arith.add(10,20);
    // arith.add(10,20,30);


    // cout<<"Hello there"<<endl;

    return 0;
}