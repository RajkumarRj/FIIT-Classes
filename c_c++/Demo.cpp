#include<iostream>
using namespace std;

class Gudardian{
    void visitWeeklyOnce(){
        cout<<"Visit weekly once"<<endl;
    }
};

class Parent{
    public:
       int salary = 50000;

       void food(){
            cout<<"We ordered Food on swiggy"<<endl;
       }
};

class Child : public Parent , Gudardian{
   

};

class Child2 : public Parent{

};

//mutltilevel
class Child1: public Child{

};

//hierarchical 

// single parent -> multiple child 


class Student{
    private:
         int phone = 123;

    public:
        int roll_no ;
        string name ;
        void setPhone(int updatedPhone){
            phone = updatedPhone;
        }
        int getPhone(){
            return phone;
        }

        Student(){ // default constructor 
            roll_no = 21;
            name ="Guest";
            cout<<"Default Constructor called"<<endl;
        }

        Student(int roll, string named){
            roll_no = roll;
            name = named;
            cout<<"parameterized constructor callled"<<endl;
        }

        void display(){
            cout<<"Display method"<<endl;
        }
};


class Arithmetic{
    public:
        void add(int a, int b){
            cout<<a+b<<endl;
        }
        
        void add(int a, int b, int c){
            cout<<a+b+c<<endl;
        }

        void add(int a , int b, int c, int d){
            cout<<a+b+c+d<<endl;
        }
};


class Payment{
    public:
        void pay(){
            cout<<"Payment paid"<<endl;
        }
};

class UPI : public Payment{
    public:
        void pay(){
            cout<<"Payment paid using UPI"<<endl;
        }
};
class COD: public Payment{
    public:
        void pay(){
            cout<<"Payment will be paid using COD"<<endl;
        }
};

class Oppo{
    public:
        virtual void display() = 0;
};


class Realme :public Oppo{
    public:
        void display(){
            cout<<"Display method from relame"<<endl;
        }
};




int main(){

    Realme realme;
    realme.display();



    UPI upi;
    upi.pay();
    COD cod;
    cod.pay();

    Arithmetic arith;
    arith.add(10,30);
    arith.add(10,30,10);
    arith.add(10,30,10,20);




    Child child;
    cout<<child.salary<<endl;
    child.food();

    Student obj;

    obj.setPhone(456);

    int finalPhone = obj.getPhone(); // 
    cout<<finalPhone<<endl;



    Student jaya(18, "Jayaprakash");
    Student ishanth(30, "Ishanth");

    cout<<jaya.roll_no<<endl;

    cout<<ishanth.roll_no<<endl;

    cout<<obj.roll_no<<endl;
    cout<<obj.name<<endl;

    // obj.display();
    return 0;
}