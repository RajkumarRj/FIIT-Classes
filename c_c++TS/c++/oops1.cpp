#include <iostream>
using namespace std;

// inheritance 

// class Parent{
//     public:
//         int salary = 50000;

//         void display(){
//             cout<<"Display method"<<endl;
//         }
// };

// class Child : public Parent {
   
// };

// class Child2 : public Child{

// };

// multiple inheritance
class Father{
    public:
        string name = "fiit";
};

class Mother{
    public:
        string mname = "academy";

};

class Child : public Father, public Mother{

};

// encapsulation => process of binding 
// data with method 

class Bank{
    private:
        string accNo = "12345";

    public:
        void getAcc(){
            cout<<accNo<<endl;
        }
};


int main(){
    Bank bank;
    // cout<<bank.accNo<<endl;
    bank.getAcc();


    Child obj;
    cout<<obj.name<<endl;
    cout<<obj.mname<<endl;


    // Child child;

    // cout<<child.salary<<endl;


    // Parent obj;
    // cout<<obj.salary<<endl;
    // obj.display();
    return 0;
}