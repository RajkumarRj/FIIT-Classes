#include <stdio.h>
#include <stdbool.h>



int main(){


    int data ; // default value is 0

    // printf("Enter integer number: ");
    // scanf("%d", &data);

    // printf("%d\n", data);

    // float marks ;

    // printf("Enter float value: ");
    // scanf("%f", &marks);

    // printf("%.2f\n", marks);


    // operators => unary, binary, ternary

    // unary => ++, --
    // binary => arithmetic, relational, logical, assignment, bitwise

    // relational => > , < , >=, <=, !=, ==

    int a = 10;
    int b = 10;

    // printf("%d \n", a >  b);
    

    // printf("%d \n", a <  b);

    // printf("%d \n", a >= b);

    // printf("%d \n", a <=  b);

    // printf("%d \n ",a != b);

    // printf("%d\n", a == b );



    // logical operators  => && || !


    // int result = a>b && a<b;

    // result = a==b && a<=b;

    // result = a==b || a<b;

    // result = !a<b;


    // printf("%d\n", result);





    // & => true true => true

    // || => true false => true
    //         false true => true
    //         true true => true

    //! => true -> false 
    // false -> true



    // assignment operator => += , -=, /=, *=, %=


    // int c = 50;

    // c  +=  10;
    // c  -=  10;
    // c  *=  10;
    // c  /=  10;
    // c  %=  10;


    // printf("%d\n", c);

    // bitwise operator => &, |, ^,  >> ,<<

//     int i=4;
//     int j=7;
    
//     int resultData = i & j;
//     printf("%d\n",resultData );

//     resultData = i | j;
//     printf("%d\n",resultData );


//     resultData = i ^ j;
//    printf("%d\n",resultData );


//     resultData = i>>2;
//     printf("%d\n",resultData );


//     resultData = i <<1;
//    printf("%d\n",resultData );

 
    //control structure 

    // conditional statement, loops

    // conditional statement  
    // if, if-else, else-if, nested if , switch

    int age = 30;
    // if(age  >  18  ){
    //     printf("You are eligible to votte");
    // }else{
    //     printf("You are not eligible to votte");
    // }

    bool isEligible = false;

    if(age >= 18){

        if(isEligible){

            printf("You are eligible to vote");
        }else{
            printf("you don't have voter id");
        }


    }else{
        printf("You are age is less then 18");
    }


    

    return 0;
}

