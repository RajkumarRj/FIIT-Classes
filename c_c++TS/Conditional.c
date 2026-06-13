#include <stdio.h>
#include <stdbool.h>

int main(){

    // printf("Hello there");
    // control structure 

    // conditional statement 

    // if , if else , 
    // else-if , nested if , switch 
    int age = 20;

    // if( age >= 18  ){

    //     printf("You are eligible to vote \n");
    // }else{
    //     printf("You are not eligible for vote \n");
    // }

    // nested 
    bool voterId = false;

    if( age >= 18){

        if(voterId){
            printf("You are eligible to vote \n");
        }else{
            printf("You don't have voter id\n");
        }

    }else {
        printf("You are less than 18 \n");
    }


    int marks = 65;
    // else if  => checks multiple condition

    if(marks >= 90){
        printf("A \n");
    }else if(marks >=80){
        printf("B \n");
    }else if(marks >=70){
        printf("C \n");
    }else{
        printf("Fail \n");
    }

    if(true){

    }
    








    // loops 

    // printf("1");
    // printf("2");

    return 0;
}