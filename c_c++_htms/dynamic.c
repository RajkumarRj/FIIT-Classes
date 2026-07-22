#include <stdio.h>
#include <stdlib.h>

int main(){

    int *ptr;
    // ptr = (int*) malloc(sizeof(int)*5);
    ptr = (int*) calloc(5, sizeof(int)); // 0
    if(ptr == NULL ){
        printf("Dynamic memory not created \n");
    }
    for(int i=0; i<5; i++){
     // ptr[i] = i+1;
        printf("%d \n", ptr[i]);
    }
    // ptr = (int*) realloc(ptr, 10*sizeof(int));

    // for(int i=5; i<10; i++ ){
    //     // ptr[i] = i+1;
    //     printf("%d \n", ptr[i]);
    // }
    free(ptr);

    return 0;
}