#include <iostream>
using namespace std;
#include <string>

class Student{
    public:
        // int data ;
        string name ;

        Student(){ // default constructor
            name = "Guest";
        }

        Student(string name1){ // parametrized 
            name = name1;
        }

        void display(){
            cout<<"Display method"<<endl;
        }
};

int main(){

    Student lashvein("Lashvein");
    cout<<lashvein.name<<endl;

    Student rithish("Rithish");
    cout<<rithish.name<<endl;


    // Student obj;
    // obj.display();
    // obj.data = 100;
    // cout<<obj.data<<endl;

    // Student obj1;

    // obj1.display();
    cout<<"C++ String"<<endl;

    string name = "Tharunraman";

    cout<<name<<endl;
    cout<<name[6]<<endl;

    cout<<name + " " +  "Hello"<<endl;

    cout<<name.length()<<endl;

    return 0;
}