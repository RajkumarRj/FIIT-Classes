#include <stdio.h>
#include <string.h>


void display(){
    printf("Hello there \n");
}

int add(int a, int b){
    return a+b;
}


int main(){

    display();
    int result = add(100,20);
    printf("%d \n", result);

    // char name[] ="Hello world";
    
    // printf("%s \n" , name);
    // char name[50]; // redmi

    // scanf("%s", name);
    // // scanf("%[^]", name);
    // printf("Hello %s \n", name);

    // printf("%d \n", strlen(name));


    // char dest[50];
    // strcpy(dest, name);

    // printf("Hello %s \n", dest);
    char str1[20]="Hello";
    char str2[20] ="Hello";
    
    // strcat(str1 , str2);

    // printf("%s \n", str1);

    // printf("Comparison %d",strcmp(str1, str2));

    // function => reusable block of code 

    return 0;
}


