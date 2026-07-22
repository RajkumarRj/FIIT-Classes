#include <stdio.h>


int main(int argc, int *argv[]){

    printf("Number of arguments: %d\n", argc);


    int sum = 0;
    int a = atoi(argv[1]);
    int b = atoi(argv[2]);

    printf("%d \n", a+b);
    for (int i = 0; i < argc; i++) {
        // sum += argv[i];
        printf("Argument %d: %s\n", i, argv[i]);
    }

    return 0;
}