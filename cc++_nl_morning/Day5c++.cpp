#include <iostream>
#include <vector>
#include <stack>
#include <fstream>
#include<thread>

using namespace std;

void checkAge(int age){

    if(age < 18){
        throw "Not Eligible";
    }
}

void display(){
    cout<<"Thread Running"<<endl;
}

void callByValue(int *a){
    *a = 30;  // 30
    cout<<*a<<endl;  // 30
}
// call by value and call by reference 

// ifstream => file read
// ofstream => write to a file
// fstream => read and write

int main(){

    int at = 10;

    callByValue(&at);

    cout<<at<<endl; // 10
    


    thread t(display);

    t.join();






    // ofstream file("student.txt");

    
    // file<<"Lashveinram"<<endl;
    // file<<"Rithish"<<endl;


    // file.close();

    // ifstream file1("student.txt");

    // string line;

    // while( getline(file1, line)){

    //     cout<<line<<endl;
    // }

    // file1.close();

    fstream lash("lashvein.txt", ios::in | ios::out | ios::trunc);

    if(!lash.is_open()){
        cout<<"Error opening file !"<<endl;
        return 1;
    }

    lash<<"Lashveinram"<<endl;
    lash<<"Fiit"<<endl;

    lash.seekg(0);


    string lashvein;

    while(getline(lash, lashvein)){
        cout<<lashvein<<endl;
    }

    lash.close();


    // STL  => Standard template library

    // vector => dynamic array that automatically grows or shrinks


    vector<int> number = {10,20};

    number.push_back(30);
    cout<<number.front()<<endl;
    cout<<number.back()<<endl;

    // number.pop_back();

    // number.clear();
    cout<<number.size()<<endl;

    for(int value :  number){
        cout<<value << " ";
    }

    cout<<endl;

    stack<string> s;
    
    s.push("Lashveinram");
    s.push("Rithish");
    s.push("FIIT");

    s.pop();

    cout<<s.top()<<endl;
    


    cout<<"Exceptional handling"<<endl;
    int a = 10;
    int b = 0;
    try{
        checkAge(17);
        // if(b == 0){
        //     throw "Division by zero";
        // }
        // throw 10.5;
        // cout<<a/b;

    }catch(const char* message){
        cout<<message<<endl;

    }catch(double value){
        cout<<"Double"<<endl;
    }catch(...){
        cout<<"Index out of bound"<<endl;
    }
  


    // try , catch, throw 




    cout<<"Exceptional handling ending"<<endl;


    return 0;
}