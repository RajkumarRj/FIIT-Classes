#include <iostream>
#include <fstream>
using namespace std;

int main(){

    // printf("File system \n");

    // ofstream file("malathi.txt"); //write


    // file<<"Malathi"<<endl;
    // file<<"Java course"<<endl;

    // read 
    ifstream fileRead("malathi.txt");

    string text;

    while(getline(fileRead, text)){

        cout<<text<<endl;
    }

    fstream readWrite("readWrite.txt", ios::out
         | ios::in);


    readWrite<<"FIIT"<<endl;
    readWrite<<"C/C++"<<endl;

    // readWrite.close();

    string text1;

    readWrite.seekg(0);

    while(getline(readWrite, text1)){
        cout<<text1<<endl;
    }

    return 0;
}