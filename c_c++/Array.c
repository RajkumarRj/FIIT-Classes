#include <stdio.h>

int main(){

    // array ->  sequence of element stored in contiguous memory

    // int size ;

    // printf("Enter array size: ");
    // scanf("%d", &size);
    
    // // int data = 10;
    // int number[size]; // declaration  1st method
    // // scanf("%d", &number[0]);

    // for(int i=0; i<size; i++){
    // scanf("%d", &number[i]);
    // }

    // for (int i = 0; i <size; i++){
    //         printf("%d ", number[i]);
    // }

    // int students[] = {70, 50, 80, 90, 100};

    // printf("%d \n", students[0]);
    // printf("%d \n", students[4]);

    // students[1] = 60;

    // printf("%d \n", students[1]);

    // for(int i=0; i<5; i++){
    //         printf("%d ", students[i]);
    // }




    // 2d array 

    int twoDArray[3][3];
    
    int twoDArrayValue[2][3] = {  {1,2,3} , {4,5,6} };

    for(int i=0; i<2; i++){

        for(int j=0; j<3; j++){
            printf("%d ", twoDArrayValue[i][j]);
        }
        printf("\n");
    }
    
    












    
    
    return 0; 
}