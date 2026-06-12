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

    printf("%d \n ", sum);


    // 1 GB => 1024 MB
    // 1 MB -> 1024 KB  (KILO BYTES)
    // 1 KB -> 1024 BYTES
    // 1 BYTE -> 8 BIT 
    // 1 BIT -> 0 OR 1

    // bitwise => & | ^ >> <<

    int t = 4;
    int s = 7;

    int ts = t & s;

    ts = t | s;

    ts = t ^ s;

    ts = t>>2;

    ts = t << 2;

    printf("Bitwise : %d \n", ts);

    // bitwise
    return 0;

}

