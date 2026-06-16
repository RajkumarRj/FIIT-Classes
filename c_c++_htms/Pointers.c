#include <stdio.h>


void display(int *b){

    *b = 100;
    printf("inside function : %d \n", b);
}

void swap(int *a, int *b){
    int temp = *a;
    *a = *b; // 30
    *b = temp; // 10
}
// void swap(int a, int b){
//     int temp = a;
//     a = b;
//     b = temp;
// }

int main(){
    // pointers => stores another variables memory address 
    int a = 10;  
    int b = 30;
    printf("Before swap a and b value %d , %d \n", a, b);

    swap(&a, &b);
    // swap(a, b);
    
    printf("After swap a and b value %d , %d \n", a, b);

    // printf("Before function : %d \n",a);
    // display(&a);

    // printf("After function : %d \n",a);
    int *ptr = &a;

    printf("%p \n" , ptr);
    printf("%d \n", *ptr);  // deferencing 
    // pass by value and pass by reference 
    return 0;
}