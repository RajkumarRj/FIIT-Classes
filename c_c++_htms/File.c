#include <stdio.h>
#include <stdbool.h>

int main(){


    FILE *fptr;
   
    fptr = fopen("example.txt", "w");

    if(fptr == NULL){
        printf("File is not created \n");
    }else{
        printf("File is created successfully \n");
    }

   fprintf(fptr, "Hello c file handling");

   fclose(fptr);

    // FILE *fptr = fopen("example.txt", "r");

    // char data[255];


    // while(  fgets(data, 255, fptr ) != NULL  ) {

    //     printf("%s ", data);
    // }


    // fclose(fptr);

    // remove("example.txt");

   







     


    return 0;
}