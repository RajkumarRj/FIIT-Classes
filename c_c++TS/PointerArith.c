#include <stdio.h>
#include<string.h>

struct Student{
    int roll_no;
    char name[50];
    double marks;
};
union StudentUnion{
    int roll_no;
    char name[50];
    double marks;
};


int main(){

    union StudentUnion uno;
    
    uno.marks = 85;
    printf("%Lf \n", uno.marks);
    
    strcpy(uno.name , "FIIT");
    printf("%s \n", uno.name);
    
    uno.roll_no = 20;
     printf("%d \n", uno.roll_no);


    

    // struct Student s1;
    // s1.roll_no = 21;
    // strcpy(s1.name , "Tharun");
    // s1.marks = 90;

    // printf("%d \n", s1.roll_no);
    // printf("%s \n", s1.name);
    // printf("%Lf \n", s1.marks);

    // struct Student s2;
    // s2.roll_no = 20;

    // strcpy(s2.name , "Sivapriya");
    // s2.marks = 91;

    
    // printf("%d \n", s2.roll_no);
    // printf("%s \n", s2.name);
    // printf("%Lf \n", s2.marks);

    // struct Student tharun;

    // tharun.roll_no = 100;

    // printf("%d \n", tharun.roll_no);

    // struct Student Siva = {50, "FIIT", 80};

    
    // printf("%d \n", Siva.roll_no);
    // printf("%s \n", Siva.name);
    // printf("%Lf \n", Siva.marks);


    



    // printf("hello there \n");

    // int arr[] = {1,2,3,4,5};

    // int *ptr = arr;

    // ptr++;
    // ptr--;

    // printf("%d \n", *ptr);

    // //double pointer
    // int var = 10;
    // int *ptr = &var;

    // int **ptrr = &ptr;

    // printf("Variable %d \n", var);
    // printf("Pointer %d \n", *ptr);
    // printf("Double poitner %d \n", **ptrr);








    return 0;
}