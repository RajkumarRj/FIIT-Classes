#include <stdio.h>


// without return type and without argument
void display(){ // call definition 
    printf("Welcome to our website \n");
}
// with return type and with argument 
int add(int a , int b){ // function definition (parameter)
    int sum = a+b;
    return sum;
}
// with return type and without argument
double circlePI(){ // function definition 
    return 3.14;
}

// without return type and with argument 

void multiply(int a, int b, int c){
    
    int result = a *b *c;
    printf("Multiply value : %d \n", result);
}

int main(){

    printf("Hello Functions \n");
    // calling a function
    display();

    int result = add(10,10); // (argument) // 20 
    printf("%d \n", result);

    double PI = circlePI();
    printf("%lf \n", PI);

    multiply(10,20,30);

    // functions  => reusable block of code 
    return 0;
}


