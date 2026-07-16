#include <stdio.h>
#include <stdlib.h>


int main(){

    int *ptr;
    ptr = (int*) malloc(5 * sizeof(int));

    if(ptr == NULL){
        printf("Memory not allocated \n");
    }
    printf("Memory allocated using calloc \n");

    for(int i=0; i<5; i++){

        ptr[i] = i+1;
        printf("%d \n", ptr[i]);
    }

    ptr = (int*) realloc(ptr, 10*sizeof(int));

    for(int i=5;i<10; i++){
        printf("Realloc : %d \n", ptr[i]);
    }


    free(ptr);

    int *ptr1;

    ptr1 = (int*) calloc(10,sizeof(int));


    
    for(int i=0; i<10; i++){

        // ptr1[i] = i+1;
        printf("%d \n", ptr1[i]);
    }



    
    return 0;
}