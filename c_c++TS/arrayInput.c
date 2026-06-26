#include <stdio.h>

int main(){


    int arr2d[3][3] = {  {1,2,3}  , {4,5,6}, {7,8,9}   };

    // 0 => 1 2 3
    // 1 => 4 5 6
    // 2 => 7 8 9
     
    //row loop
    for(int i=0; i<3; i++){

        //column for loop 
        for(int j=0; j<3; j++){

            printf("%d ", arr2d[i][j]);
        }
        printf("\n");

    }

    // printf("%d \n", arr2d[0][0]);
    // printf("%d \n", arr2d[0][1]);
    // printf("%d \n", arr2d[0][2]);

    // printf("%d \n", arr2d[1][0]);
    // printf("%d \n", arr2d[1][1]);
    // printf("%d \n", arr2d[1][2]);

    // printf("%d \n", arr2d[2][0]);
    // printf("%d \n", arr2d[2][1]);
    // printf("%d \n", arr2d[2][2]);








    // int size;

    // printf("Enter array size: ");

    // scanf("%d", &size);

    // int arr[size];

    // for(int i=0; i<size; i++){

    //     scanf("%d", &arr[i]);
    // }

    //  for(int i=0; i<size; i++){

    //     printf("%d th  Array elements  %d \n" ,i ,arr[i]);
    // }


    return 0;
}