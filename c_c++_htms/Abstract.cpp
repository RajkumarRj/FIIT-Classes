#include <iostream>
using namespace std;

class Parent{
    public:
        virtual void display() =0; // incomplete method 
};


class Child : public Parent{
    public: 
        void display(){
            printf("Display method from chld class \n");
        }
};

// abstract class => don't allow object to create 
enum Direction{
    NORTH = 10,
    SOUTH,
    EAST =30,
    WEST
};

int main(){

    Direction x = WEST;

    cout<<x<<endl;


    int a = 5;
    int b= 2;

    try{
        if(b == 0){
            throw "Division by zeroooo";
        }
        
        int b = a/b; // stops the application 
    }
    catch(...){

        cout << "Exception caught: " <<endl;
    }


    try{
        throw runtime_error("Runtime error occurred!");
    }
    catch (const exception& e) {
        cout << "Caught exception: " << e.what();
    }
    


    








    struct Student{
        int id;
        string name;
        double marks;
    };


    Student s1;
    
    s1.id = 21;
    s1.name = "Malathi";
    s1.marks = 90;

    s1.id = 50;

    cout<<s1.id<<endl;
    cout<<s1.marks<<endl;


    cout<<s1.name<<endl;



    Child child;
    child.display();

    // Parent obj;

    // obj.display();


    cout<<"Abstraction"<<endl;



    return 0;
}