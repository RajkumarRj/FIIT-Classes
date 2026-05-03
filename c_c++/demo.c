#include <stdio.h>

void display(); // declaration

int main(){

    printf("Hello World \n");
    display();
    int result = vitRank();

    printf("Result is : %d \n", result);

    sum(10, 10);

    int multiplied = multiply(10,20,30);
    printf("Multiplied value :%d",multiplied);
    // functions -> () , {}  block of code 
    return 0;
}

//with argument and with return value 
int multiply(int a, int b, int c){
    return a*b*c;
}
// with argument and without return value 
void sum(int a, int  b){
   int addedValue = a+b;
   printf("Added value : %d \n", addedValue);
}
// without argument and without return value 
// definition
void display(){
    printf("This is display function \n");
}
// without argument and with return value 
int vitRank(){
    return 10;
}


