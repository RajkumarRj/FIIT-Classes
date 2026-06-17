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
    // bool voterId = false;

    // if( age >= 18){

    //     if(voterId){
    //         printf("You are eligible to vote \n");
    //     }else{
    //         printf("You don't have voter id\n");
    //     }

    // }else {
    //     printf("You are less than 18 \n");
    // }


    int marks = 70;
    // else if  => checks multiple condition

    // if(marks >= 90){
    //     printf("A \n");
    // }else if(marks >=80){
    //     printf("B \n");
    // }else if(marks >=70){
    //     printf("C \n");
    // }else{
    //     printf("Fail \n");
    // }

   
    // switch 

    // switch(marks){
    //     case 90 : 
    //         printf("A \n");
    //         break;
    //     case 80:
    //         printf("B \n");
    //         break;
    //     default :
    //         printf("INvalid marks \n");
    //         break;
    // }
    



    // loops => for, while, do-while

    // for syntaxx 

    // for(int i=1;  i<=10 ; i++){

    //     if(i % 2 == 0){

    //         printf("Even number : %d \n", i);
    //     }
    // }

    // while loop 
    // int j=1;

    // while(j<=10){

    //     printf("%d \n", j);
    //     j++;

    // }

    // int j=10;

    // while(j >0){
    //     printf("%d \n",j );
    //     j--;
    // }


    // int k = 1;
    // do{

    //     printf("DO while : %d \n", k);
    //     k++;
    // }while(k<=10);


    // jump statement => break , continue

    for(int i=10; i>0; i--){

        if(i == 5){
            // break;
            continue;
        }
        printf("%d \n", i);
    }
    










   


    






  

    // printf("1");
    // printf("2");

    return 0;
}