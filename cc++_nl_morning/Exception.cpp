#include <iostream>
#include <fstream>
using namespace std;

void change(int *a ){

    *a = 40;
    cout<<*a<<endl;  
}

// call by reference 

int main(){

    int a = 10;

    change(&a);

    cout<<a<<endl;   

    // ofstream file("rithish.txt");

    // file<<"Rithish"<<endl;
    // file<<"Lashveinram"<<endl;

    // file.close();

    // ifstream file1("rithish.txt");

    // string text;

    // while(getline(file1, text)){

    //     cout<<text<<endl;
    // }

    // file1.close();

    // fstream file3("frithish.txt" , ios::in | ios::out | ios::trunc);

    // file3<<"FIIT"<<endl;
    // file3<<"Academy"<<endl;

    // file3.seekg(0);


    // string line;

    // while(getline(file3, line)){
    //     cout<<line<<endl;
    // }

    // // call by value and call by reference (function)






    // cout<<"Exception handling"<<endl;


    // try{
    //     throw "DIvisible by zero";
    //     cout<<10/0;

    // }catch(...){
    //     cout<<"exception handled"<<endl;
    // }


    cout<<"over"<<endl;

    return 0;
}


