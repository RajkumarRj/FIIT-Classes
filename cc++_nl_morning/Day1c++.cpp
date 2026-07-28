#include<iostream>
#include<cmath>
using namespace std;


int main(){


    // cout<<"Hello c++"<<endl;

    // cout<<sqrt(64)<<endl;
    // cout<<ceil(5.6)<<endl;
    // cout<<floor(5.6)<<endl;
    cout<<pow(2,7)<<endl;


    int size;
    cout<<"enter array size :";
    cin>>size;


    int arr[size];

    for(int i=0; i<size; i++){
       cin>>arr[i];
       cout<<"Array elements "<<arr[i]<<endl;
    }

    return 0;
}