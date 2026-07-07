#include <stdio.h>
#include <stdbool.h>

int main(){


    // int a;

    // printf("Enter a Integer number: ");
    // scanf("%d", &a);

    // printf("%d\n", a);


    // float b;


    // printf("Enter a Float number: ");
    // scanf("%f", &b);

    // printf("%.2f\n", b);


    // char c;

    // printf("Enter a character: ");
    // scanf("%c", &c);

    // printf("%c \n", c);

    // operators 
    // it's a special symbol that's tells compiler 
    // to do a specific task 

    // unary, binary, ternary 

    // unary => need only one operand 

    // ++, -- 

    int count = 0;

    count++; //1
    count--; // 0

    count++; // 1
    count++; // 2

    count--; // 1


    // printf("%d \n", count);

    //binary => need atleast two operand
        // arithmetic => (+, -, /, *, %)

        int x = 10;
        int y = 10;

        // int result = x + y;
        // result = x-y;
        // result = x*y;
        // result = x/y;

        // result = 3 % 2 ;


        // printf("%d \n", result);

        // relational => (> , <, >=, <=, ==, !=  )

        // 10 > 4
        // printf("%d \n", x > y);
        // printf("%d \n", x < y);

        // printf("%d \n", x >= y);

        // printf("%d \n", x <= y);

        // printf("%d \n", x == y);

        // printf("%d \n", x != y);
 
    // ramyasaravana05@gmail.com
    // 6385705108

        // logical ( && , ||, !)

        // printf(" AND %d \n", true && false);
        // true true  => true
        // false true => false
        // false false => false

        // printf("OR %d \n", false || true);

        // flase fasle => false
        // true false => true 

        // printf("NOT %d \n",  !false);



        // assignment (+=, -=, /=, *=, %=)

        int mark = 85;

        // mark = mark + 5;

        mark += 5;

     // bitwise (bit => 0 or 1)
     // & | ^ >> << 

     int a = 5;
     int b = 6;

    //  printf("%d \n", a & b);
    //   printf("%d \n", a | b);
    //   printf("%d \n", a ^ b);

    // >> => right shift operator 
      printf("Right shift : %d \n", a >> 1);

      printf("Left shift : %d \n", a << 1);

    // const double PI = 3.14;
    // PI = 3.22;
    // printf("%.2Lf \n", PI);


    // bool isEligible = true;

    // printf("%d \n", isEligible);


    return 0;
}