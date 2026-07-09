#include <stdio.h>


// with argument and with return type
int multi(int a, int b){
    int mul = a*b;
    return mul;
}

// with argument and without return type 

void sub(int x, int y){
    int subb = x-y;
    printf("%d \n", subb);
 
}

// without argument and without return type 

void display(){

    printf("Hello there \n");
}

// without argument and with return type 

double  add(){
    return 3.14;
}


int main(){


    int var = 10;

    int *ptr = &var;

    *ptr = 20;

    printf("%p \n", &var);

    printf("%p \n", ptr);

    printf("%d \n", *ptr);

    // sub(10,5);

    // display();
    // int multiply = multi(10,20); // 200
    // printf("%d \n", multiply);
    // double result = add(); // 10

    // printf("%Lf \n", result);

    return 0;
}