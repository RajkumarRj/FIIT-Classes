#include <stdio.h>

int main(){

    printf("Hello there \n");

    //loops 
   
    // for, while, do-wihle 

    // for(int i=1; i<=10 ; i++ ){
    //     // if(i % 2  == 0){
    //     //     printf("Even number: %d \n", i);
    //     // }
    //         printf(" %d \n", i);
    // }

    //while loop 
    // int j=10;
    // while(j>0){
    //     printf("J value : %d \n", j);
    //     j--;
    // }

    // do-while loop 

    // int x = 1;
    // do{
    //     printf("%d \n", x);
    //     x++;
    // }while(x == 0);

    // jump statement => break , continue 


    // for(int i=1; i<=10; i++){

    //     if(i == 5){
    //         // break;
    //         continue;// skips a current iteration 
    //     }  
    //     printf("%d \n", i);

    // }

    // array 
    
    // int numbers[] = {10,20,30,40,50};

    // printf("%d \n", numbers[0]);

    // printf("%d \n", numbers[3]);

    // array => for loop 

    // numbers[2] = 60;

    // for(int i=0; i<5; i++){
    //   printf("%d \n", numbers[i]);
    // }


    int size;
    printf("Enter array size: ");
    scanf("%d", &size);

    int useArray[size];
    
    for(int i=0; i<size; i++){
        printf("Enter %d th value: ",i );
        scanf("%d ", &useArray[i]);
    }

    int sum;

    for(int i=0; i<size; i++){
        sum += useArray[i];
        printf("%d \n", useArray[i]);
    }

    printf("Sum value %d", sum);

    return 0;
}