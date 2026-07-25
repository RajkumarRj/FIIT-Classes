#include <iostream>
using namespace std;


class Student{
    // variables and methods 
    public:
    string name;

    Student(string name1){
        name = name1;
    }

    void display(){

        cout<<"Display method from Student class"<<endl;
    }
}; 
// 1 byte 


int main(){

    // classname obj;
    Student obj("Tharun");
    cout<<obj.name<<endl;
    obj.display();

    Student obj1("Sivapriya");
    cout<<obj1.name<<endl;
    obj1.display();
    


    cout<<"Hello string"<<endl;

    string name = "FIIT";

    cout<<name.length()<<endl;
    cout<<name[3]<<endl;


    cout<<name + " " + "Academy"<<endl;

    // class => blueprint for object 


    return 0;
}