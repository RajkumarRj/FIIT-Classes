#include <iostream>

using namespace std;

struct Student{
    int roll_no;
    string name;
    char Grade;
};

enum SIDE{
    RIGHT,
    LEFT = 20,
    TOP,
    DOWN,
};

int main(){

    SIDE x = TOP;
    cout<<x<<endl;

    struct Student s1;

    s1.roll_no = 10;
    s1.name = "jayaprakash";
    s1.Grade = 'A';


    cout<<s1.Grade<<endl;
    cout<<s1.name<<endl;
    cout<<s1.roll_no<<endl;

    

    cout<<"Hello there"<<endl;
    return 0;
}