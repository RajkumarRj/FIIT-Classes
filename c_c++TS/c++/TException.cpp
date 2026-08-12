#include <iostream>
#include <fstream>
using namespace std;

// ofstream -> allows to write data to a file 
// ifstream -> read file
// fstream -> both read and write 

int main(){
    // ofstream file("tharun.txt");
    // file<<"Tarunraman"<<endl;
    // file<<"Sivapriya"<<endl;
    // file.close();

    // ifstream file1("tharun.txt");
    // string line;
    // while( getline(file1 , line ) ){

    //     cout<<line<<endl;
    // }


    fstream file3("tarun.txt" ,ios::in | ios::out | ios::trunc );
    file3<<"FIIT"<<endl;
    file3<<"Academy"<<endl;

    file3.seekg(0);
    string text;
    while(getline(file3, text)){
        cout<<text<<endl;
    }


    // cout<<"APplication started"<<endl;

    // int a =10;
    // int b = 0;

    // try{
    //     if(b==0){
    //          throw "Divisible by zero";
    //     }

    //     cout<<a/b<<endl;

    // }catch(const char* message){
    //     cout<<message<<endl;

    // }


    // cout<<"Application end"<<endl;

    return 0;
}