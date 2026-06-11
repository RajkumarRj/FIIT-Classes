#include<stdio.h>
#include <stdbool.h>

int main(){

    // parentheses = > ()

    printf("Operators \n");
    // operators =>  special symbol that 
    // tells compiler to do specific task 

    // unary , binary, ternary 

    // unary => need only one operand

    // ++, --


    int a = 10 ;

    a++;
    a--;
    a--;

    printf("%d \n", a);


    // binary operators => need atleast two operand 
    // arithmetic  => +, -, /, *, %

    int i = 10;
    int j = 10;

    int result = i+j;

    result = i - j;
    result = i*j;

    result = i/j;

    result = 4 % 2 ;

    printf("%d \n ",result );

    // relational => >, <, >=, <=, ==, !=

    bool output = i > j ;
    output = i < j;

    output = i>=j;

    output = i<=j;

    output = i==j;

    output = i!= j;

    printf("%d \n", output);


    // logical => &&(AND)   ||(OR) !(NOT)

    int logical = true && true;

    logical = false || true;

    logical = !true;

    printf("Logical ! : %d \n", logical);

    


    // assignment => += , -=, /=, *=, %=

    int sum = 10;

    sum += 10;
    sum -= 5;

    sum *= 20;

    sum /= 2;
    sum %=2;

    printf("%d ", sum);








    // bitwise
    return 0;

}

