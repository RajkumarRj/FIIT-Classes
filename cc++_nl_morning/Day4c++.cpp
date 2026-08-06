#include <iostream>
using namespace std;

// polymorphism -> many forms 

// method overloading (compile-time) same method name but different in parameter sizes
// method overriding (run-time)



class Arithmetic{
    public:
        int total = 10;

        void add(int a, int b){
            cout<<a+b<<endl;
        }

        void add(int a,int b, int c){
            cout<<a+b+c<<endl;
        }
};

// class properties => you need to create object for that 

class Payment{
    public:
        void pay(){
            cout<<"Payment successfull"<<endl;
        }
};

class COD : public Payment{
    public:
        void pay(){
            cout<<"Payment paid using COD"<<endl;
        }
};
class UPI :public Payment{
    public:
        void pay(){
            cout<<"Payment paid using UPI"<<endl;
        }
};


// abstraction 

// coffee brewing machine 

// abstract class => we are not able to create object 
class Coffee{
    public:
     virtual void sugar() = 0;
     virtual void milk() = 0  ;// don't have definition
};

class CoffeeButton: public Coffee{
        public:
            void sugar(){
                cout<<"Sugar added"<<endl;
            }
            void milk(){
                cout<<"Milk added"<<endl;
            }
};

struct Student{
    int rollno;
    string name;
    float marks;
};

enum Week{
    MONDAY = 10,
    TUESDAY,
    WEDNESDAY
};
int main(){

    Week x = TUESDAY;

    cout<<x<<endl;

    struct Student s1;

    s1.rollno = 21;
    s1.name = "FIIT";
    s1.marks = 90;

    cout<<s1.rollno<<endl;
    cout<<s1.name<<endl;
    cout<<s1.marks<<endl;





    int a = 10;
    int *ptr = &a;
    cout<<*ptr<<endl; // deferencing





    CoffeeButton button;
    button.sugar();

   
    

    UPI upi;
    upi.pay();

    COD cod;
    cod.pay();

    Payment pp;
    pp.pay();




    Arithmetic arith;  // object creation

    arith.add(10,20);
    arith.add(10,20,30);




    cout<<"Polymorphism"<<endl;

    return 0;
}