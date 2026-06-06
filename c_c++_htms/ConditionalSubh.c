#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main(){



    // printf("Hello \n");

    // printf("world \n");



    // control structures 

    // conditional statements, loops


    // conditional statements

    // if, if-else , else-if, nested if , switch

    // if
    
    // int age = 2;

    // if(age >= 18){
    //     printf("You are eligible fot vote \n");
    // }else{
    //     printf("You age is less than 18\n");
    // }

    // nested if 
    // bool voterId = false;

    // if(age >= 18){

    //     if(voterId){
    //         printf("You are eligible for vote \n");
    //     }else{
    //         printf("you don't have voterid \n");
    //     }

    // }else{
    //     printf("your age is less than 18 \n");
    // }

    // else-if or else-if ladder

    // int marks = 50;

    // if(marks >= 80){
    //     printf("A grade \n");
    // }else if(marks >70){

    //     printf("B grade \n");
    // }else if(marks >60){
    //     printf("C grade \n");
    // }else if(marks > 50 ){
    //     printf("D grade \n");
    // }else {
    //     printf("Fail \n");
    // }


    // // switch statement 

    // switch(marks){

    //     case 90: 
    //         printf("A grade \n");
    //         break;
           
    //     case 80:
    //         printf("B grade \n");
    //         break;
        
    //     default :
    //         printf("Fail \n");
    //         break;
    // }


    // loops = for, while, do while loop 



    // printf("%d \n", 1);

    // printf("%d \n",2);


    // for(int i=1; i<=100;  i++ ){

    //     if( i % 2 != 0  ){

    //         printf("%d\n",i );
    //     }
    // }

    
    // while loop 
    // int j=10;

    // while(j>=1){
    //     printf("%d \n",j );
    //     j--;
    // }

    // do - while loop 
    // int k =5;

    // do{
    //     printf("Do while statement \n");
    //     k++;

    // }while( k <=10);


    // jump statements 

    // break ;

   

    // for(int i=1; i<=10; i++){

    //     if( i == 5){
    //         break;
    //     }

    //     printf("Break : %d \n", i);
    // }
    // continue;

    //  for(int i=1; i<=10; i++){

    //     if( i == 5){
    //         continue; // skip
    //     }

    //     printf("continue : %d \n", i);
    // }


    // array 

    // int arr[] = {10,20,30,40,50};

    // int marks = 20;
    // arr[2]  = 90;
    // printf("%d\n", arr[0]);
    // printf("%d\n", arr[1]);
    // printf("%d\n", arr[2]);
    // printf("%d\n", arr[3]);
    // printf("%d\n", arr[4]);
    // for(int i=0; i<5;  i++){
    //     printf("%d\n", arr[i]);
    // }


    // int size;

    // printf("Enter array size: ");
    // scanf("%d", &size);


    // int user[size];

    // for(int i=0; i<size; i++){
    //     printf("Enter array values: ");
    //     scanf("%d", &user[i]);
    // }

    // for(int i=0; i<size; i++){
    //     printf("user array values : %d\n ", user[i]);
        
    // }

    // 2d  array 

    int arr2D[3][3] ={  {1,2,3}, {4,5,6} ,{7,8,9}};



    // printf("%d ", arr2D[0][0]);
    // printf("%d ", arr2D[0][1]);
    // printf("%d \n", arr2D[0][2]);

    // printf("%d ", arr2D[1][0]);
    // printf("%d ", arr2D[1][1]);
    // printf("%d \n", arr2D[1][2]);


    // printf("%d ", arr2D[2][0]);
    // printf("%d ", arr2D[2][1]);
    // printf("%d \n", arr2D[2][2]);


    int result ;

    for(int i=0; i<3;  i++){ // outer for loop or row loop

        // column loop 
        for(int j=0; j<3; j++){

            result += arr2D[i][j];
            printf("%d ", arr2D[i][j]);
        }

        printf("\n");
    }

    printf("Sum of 2d array : %d \n", result);


    // strings  => sequence of character


    // char name = 'f';

    char name[] = "Hello world";

    
    
    printf("%s \n", name);
    
    
    char department[100];
    
    // scanf("%s", department);
    
    // string methods 
    
    // strlen();
    
    printf("String length : %d \n ", strlen(name));
    
    // strcpy();
    
    strcpy(department,name);
    
    printf("%s\n", department);


    // strcmp();
    char fiit[20] ="Hello world";
    printf("%s \n",fiit);

    printf("%d \n", strcmp(fiit, name)); // same => 0
    // different => 1


    // strcat();
    char greet[50] = "Hello";
    char greet2[50] =" World";

    strcat(greet, greet2);

    printf("%s \n", greet);

    return 0;
}