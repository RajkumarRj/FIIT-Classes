#include <stdio.h>
#include <string.h>

struct Student{
    int roll_no;
    char name[50];
    int age;
    float marks;
};


enum weekday {sunday, monday, tuesday, wednesday};


int main(){

    enum weekday today = tuesday;

    printf("%d\n", today);

    struct Student s1;
    s1.roll_no = 10;
    strcpy(s1.name , "jayaprakash");
    // s1.name ="Jayaprakash"; // doesn't work 
    s1.age=18;
    s1.marks=430;

    printf("%s\n", s1.name);
    printf("%d\n", s1.roll_no);

    printf("%d\n", s1.age);

    printf("%f\n", s1.marks);

   

    // 1st way 
    char name[]="Hello FIIT";
    // 2nd way 
    char str[] = {'H', 'E', 'L','L', 'O'};

    //3rd way 
    char *strr = "Hello";


    // printf("%s", name);

    // char names[50];

    // scanf(" %s", names);

    // printf("%s\n", names);


    // printf("Length %d\n", strlen(names));


    // char dest[50];

    // strcpy(dest, names);
    
    // printf("%s\n", dest);



    // char fiit[50]="Hello";
    // char fiiit[50]="Hello";

    // strcat(fiit, fiiit);

    // printf("%s\n", fiit);

    // printf("Comparation -> %d", strcmp(fiit, fiiit));


    // pointer
    // int data = 10;
   
    // int *ptr = &data;

    // printf("%d", data);
    
    // // dereferencing 
    // printf("%d", *ptr);

    int arr[]={1,2,3,4,5};

    int *ptrr = arr;

    printf("First elements %d", *ptrr);

    ptrr++;

    printf("Second elements %d", *ptrr);


    // structures 
    // user-defined data types 
    return 0;
}

