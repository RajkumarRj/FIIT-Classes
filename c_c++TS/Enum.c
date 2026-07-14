#include <stdio.h>

// enum definition

enum Direction {
    East =10,
    West,
    North = 30,
    South
};

int main(){

    // FILE *file;

    // file = fopen("example.txt", "w");

    // fprintf(file, "Hello c / c++ students \n");
    // fprintf(file , "Hello Java");

    // fclose(file);


    FILE *file1;

    file1 = fopen("example.txt", "r");

    char content[255];

    while(fgets(content, 255, file1) != NULL){
        printf("%s \n", content);
    }

    fclose(file1);
    

    FILE *file3;

    file3 = fopen("example.txt", "a");

    fprintf(file3, "Hello Python \n");
    fprintf(file3 , "Hello Javascript");

    fclose(file3);



    

    



    // int a ;

    // enum Direction fiit  = South;

    // printf("%d \n", fiit );




    return 0;
}