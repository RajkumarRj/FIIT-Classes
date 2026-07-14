#include <iostream>
#include <fstream>
using namespace std;

int main(){
    fstream tamil("tamil.txt" , ios::in |  ios::out);

    tamil<<"Hello tamil"<<endl;
    tamil<<"i5 Intel core"<<endl;


    tamil.seekg(0);
    string result;

    while(getline(tamil, result)){
        cout<<result<<endl;
    }






    // ofstream file("redmi.txt");

    // file<<"i5 intel 11th Gen"<<endl;
    // file<<"8GB RAM"<<endl;


    // ifstream file1("redmi.txt");
    // string data;

    // while(getline(file1, data)){
    //     cout<<data<<endl;
    // }
    

    int a = 10;
    int b =0;
    cout<<"program starting"<<endl;

    try{
        /* code */
        throw runtime_error("RUntime error occured");
        if(b == 0) throw "Divixion by zero";
        cout<< a/0 <<endl;

    }
    catch(...){
        cout<<"Error occured"<<endl;
    }
    

    cout<<"Program ending..."<<endl;


    return 0;
}