#include <stdio.h>
#include<string.h>
#include <stdlib.h>

// union Student{
//     int roll_no;
//     char name[50];
//     float marks;
// };

int main(){


    int *ptr;

    // ptr = (int*) malloc(sizeof(int)*5 ); // 20
    ptr = (int*) calloc(5, sizeof(int)); // 20

    for(int i=0; i<5; i++){
        // ptr[i] = i+1;
        printf("%d \n", ptr[i]);
    }

    // ptr = (int *) realloc(ptr, sizeof(int) * 10);

    // for(int i=5; i<10; i++){

    //     printf("%d \n", ptr[i]);
    // }

    // free(ptr);


    // FILE *file;

    // file = fopen("example.txt", "a");

    // if(file == NULL){
    //     printf("FIle not created \n");
    // }
    // fprintf(file, "C  Dennis ritchie \n");
    // fprintf(file, "1972 \n");

    // fclose(file);

    // FILE *file1 = fopen("example.txt", "r");

    // if(file1 == NULL){
    //     printf("File does not exist \n");
    // }
    // char data[255];

    // while( fgets(data , 255, file1) != NULL){

    //     printf("%s\n", data);
    // }
   

    // printf("Union \n");

    // union Student s1;

    
    
    // s1.marks = 98;
    // strcpy(s1.name , "Harish");
    // s1.roll_no = 21;

    // printf("%d \n", s1.roll_no);
    // printf("%s \n", s1.name);

    // printf("%f \n", s1.marks);



    return 0;
}