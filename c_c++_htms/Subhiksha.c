#include <stdio.h> // standard input/ouput library 
#include <stdbool.h>


// comments -> compiler will ignore that statement
// main function - program execution 
int main(){

    // data types in c 

    // primitive data types => provided by language (fixed size)
    // dervied  data types  => array, pointers
    // user-defined data types => created by programmer (structures, union, enums)


    // format specifier 
    // %d => integer
    // %f => float

    // escape sequence 
    // \n 

   
    int data = 90;
    printf( "%d \n" ,  data);


    int value = 100;
    printf("%d \n", value);



    int total_marks = 545;
    printf("%d \n", total_marks);

    int PI =22/7;

    // long int => 8 bytes 

    float results = 90; // 4
    printf("%.2f \n", results);

    double salary = 15000.00; // 8
    printf("%lf \n", salary);



    long double incentives = 9000.00; // 10
    printf("%Lf \n", incentives  );

    char single_letter = 'S'; // 1 byte 
    printf("%c \n", single_letter );

    bool is_eligible = false;
    printf("%d \n", is_eligible);

    //  dont's
    //    variable does not start with numbers  123data
    // variables does not start with special characters / symbols #@.,/data
    // total marks = 545


    // int memory size => 4 bytes 

    // 1 bytes => 8 bit 
    // 1 bit => 0 or 1

    // 4 bytes => 32 bite


    // operators => it's a special type of symbols 
    // that tells compiler to do specific task 

    // unary , binary, ternary 

    // unary => it needs only one operand 
    //  => ++, --

    int a = 10;

    printf("%d\n", a);

    a++; // 11

    printf("%d\n", a);
    a--; //10

    printf("%d\n",a );

    // binary operator => it needs atleast two operand 
    // arithmetic => +, -, *, /, %

    int i = 10;
    int j = 10;

    int result  = i+j; // 10 + 10 = 20 

    result = i-j; // 10 - 10 = 0

    result = i*j; // 10*10 = 100

    result = i/j; // 10/10 = 1

    result = 7 % 4; // 10%10 = 0

    // % => reminder 

    

    printf("%d \n", result);





    // relational => return value as boolean (true or false);
    // > , < , >=, <=, ==, !=

    result =  i > j ;   // 10 > 20
    result = i < j;  // 10 < 20  or 10 < 10 

    result = i <= j;

    result = i >= j;

    result = i==j ; // 10 == 10 

    result = i!= j; // 10 != 10

    printf("Relational Operator : %d \n", result);



    // logical => return value as boolean (true or false)
    // && (AND) || !  

    bool first = true;
    bool second = true;

    result = first && second;

    result  = first || second ;

    result = !second;

    printf("Logical operator : %d\n", result);



    // assignment => += , -=, *=, /=, %= ,

    int subhiksha = 90;

    // subhiksha = subhiksha + 10; // 90 + 10 = 100

    subhiksha += 10; // 100 

    subhiksha -= 10; // 90

    subhiksha *= 2; // 180

    subhiksha /= 2;  // 90

    subhiksha %= 5;  //


    // bitwise => & , |,  ^,  >>, <<


    int r = 3;
    int m = 4;

    int bitwise_result = r & m;


    bitwise_result = r | m;

    bitwise_result = r>> 2;

    bitwise_result = r<<2;

    printf("Bitwise result: %d", bitwise_result);







}


// function => block of code to perform particular task 

// pre-defined => writtened by c programmers
// user-defined => writtened by developers







