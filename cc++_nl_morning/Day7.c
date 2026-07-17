#include <stdio.h>

int main(){

    // printf("Union "); 


    int arr[] = {10,40,30,90, 35, 60};

    // find largest number in the array 
    int max;
    int min = arr[2];
    for(int i=0; i<6; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        if(min > arr[i]){
            min = arr[i];
        }
        // printf("%d \n", arr[i]);
    }
    printf("Maxium Value : %d \n" , max);
    printf("Minimum Value : %d \n" , min);


    return 0;
}






// 1/7 => data types , variables, c intro
// 2/7 => lab
// 3/7 =>operators 

// 7/7 => bitwise operator , 

// 8/7 => lab
// 9/7 => condition statement , loops
// 10/7 => lab 
// 11/7 => array, 
// 15/7 => functions , structures , 
// 16/7 => lab

