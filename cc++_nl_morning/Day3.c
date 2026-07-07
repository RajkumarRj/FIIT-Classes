#include <stdio.h>
#include <stdbool.h>



int main(){ 

    //control structures 
    printf("Control structures \n");

    // conditional statements ( if, if-else, else-if, nested if , switch)

    int age = 18;

    bool  voterId = false;

    // if(age > 18){
    //         printf("You are eligible to vote \n");
    // }else{
    //     printf("You are not eligible \n");
    // }

    // nested if 

    // if(age >= 18){
          
    //     if(voterId){
    //             printf("You are eligible to vote \n");
    //     }else{
    //         printf("you don't have voter id");
    //     }

    // }else{
    //     printf("Your age is less than 18\n");
    // }


    // else-if ladder 
    int marks = 90;
    // if( marks >= 90){
    //     printf("A \n");
    // }else if(marks >= 80){
    //     printf("B \n");
    // }else if(marks >= 70){
    //     printf("C \n");
    // }else {
    //     printf("Fail \n");
    // }
    switch(marks){
        case 90: 
            printf("A \n");
            break;    
        case 80:
            printf("B \n");
            break;
        default:
            printf("Fail \n");
            break;
    }
    // llashveinram@gmail.com
    // 8778100220


    


   

    

    // loops  (for, while, do-while)



    return 0;
}