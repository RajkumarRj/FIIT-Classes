#include <iostream>
using namespace std;
#include <fstream>

int main(){

    // file handling 
    // ofstream  => write 
    // ifstream  => read
    // fstream  => read and write 
    // ofstream file("student.txt");

    // file<<"Sivapriya"<<endl;
    // file<<"Tharunraman"<<endl;
    // file.close();

    // ifstream file1("student.txt");
    // string line;
    // while(getline(file1, line)){
    //     cout<<line<<endl;
    // }


    fstream file3("sivapriya.txt" , ios::in| ios::out | ios::trunc);

    file3<<"FIIT"<<endl;
    file3<<"Academy"<<endl;

    file3.seekg(0);

    string line1;

    while(getline(file3, line1)){
        cout<<line1<<endl;
    }






    cout<<"Exception Handling"<<endl;
    int a = 10;
    int b = 0;

    try{

        if(b == 0 ){
            throw "Denominator is zero";
        }
        cout<< a/b <<endl;  // stop

    }catch(const char* message){
        cout<<message<<endl;
    }


    // exception handling keyword 

    // try, catch  , throw 

    cout<<"End"<<endl;


    return 0;
}