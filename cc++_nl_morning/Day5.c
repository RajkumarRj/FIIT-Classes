#include <stdio.h>
#include <string.h>

int main(){
    char str[] = "FIIT";
    char name[40];
    strcpy(name , str);
    printf("Strcpy method %s \n", name);
    printf("%s\n", str);
    printf("%d \n", strlen(str));
    char str1[] ="Hello";
    char str2[] = "Hello";
    // strcat(str1 ,str2);
    printf("%s \n", str1);
    printf("Compare method %d \n", strcmp(str1, str2));

    int arr[] ={1,2,3,4,5};

    int arr2d[3][3] = {  {1,2,3} , {4,5,6} , {7,8,9} };

    int matrix[3][3] = {  {1,2,3} , {4,5,6} , {7,8,9}};

    int result [3][3];

    int sum ;
    for(int i=0; i<3; i++ ){ // row

        for(int j=0; j<3; j++){
            sum += arr2d[i][j];

          result [i][j]  =  arr2d[i][j]  + matrix[i][j];
        }
    }

    printf("Sum value of arr2d %d \n", sum);
    for(int i=0; i<3; i++ ){ // row

        for(int j=0; j<3; j++){

            printf("%d ",result[i][j]);
        }

        printf("\n");


    }
    // 1 2 3
    // 4 5 6
    // 7 8 9

    printf("%d \n", arr[0]);

    printf("%d \n", arr2d[2][0]);

    for(int i=0; i<3; i++ ){ // row

        for(int j=0; j<3; j++){

            printf("%d ",arr2d[i][j]);
        }

        printf("\n");


    }

    return 0;
}