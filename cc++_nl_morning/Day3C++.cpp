#include <iostream>
using namespace std;

// single level inheritance => one parent -> one child
// multi level inheritance => grandparent -> parent -> child

// class Parent{
//     public:
//         int salary = 50000;

//         void display(){
//             cout<<"Display method"<<endl;
//         }
// };

// class Work :public Parent{

// };


// class Child : public Parent{
   
// };

// class Child2 : public Child , public Parent {

// };

// Encapsulation => Encapsulation is the process 
// of binding  data and the methods
// data hiding 

class Bank{
    private:
        string accno = "12345";
    
    public:
        void getter(){
            cout<<accno<<endl;
        }

        void setter(string acc){
            accno = acc;
        }
};
// getter , setter 
// method overloading (compile -time poly)
class Arithmetic{
        public:
            void add(int a, int b){
                cout<<a+b<<endl;
            }

            void add(int a, int b, int c){
                cout<<a+b+c<<endl;
            }
};

int main(){

    Arithmetic arith;
    arith.add(10,20);
    arith.add(10,20,30);

    Bank bank;
    bank.setter("34567");
    bank.getter();
    // cout<<bank.accno<<endl;

    // Child child;

    // cout<<child.salary<<endl;
    // child.display();



    cout<<"Inheritance"<<endl;

    return 0;
}