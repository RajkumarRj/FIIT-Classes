#include<stdio.h>


int main(){

    FILE *file;

    file = fopen("example.txt", "w");


    fprintf(file , "FIIT academy");

    fclose(file);

    FILE  *file3;

    file3 = fopen("example.txt", "a");

    fprintf(file3, "\n Append text");

    fclose(file3);


    FILE *file2 ;

    file2 = fopen("example.txt", "r");

    char buffer[255];

    while(fgets(buffer, 255, file2) != NULL){
        printf("%s", buffer);
    }
    // char ch ;

    // ch = fgetc(file2);

    // while(ch != EOF){
    //     printf("%c", ch);
    //     ch = fgetc(file2);
    // }


    return 0;
}