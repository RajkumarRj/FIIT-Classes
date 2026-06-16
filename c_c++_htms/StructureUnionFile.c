#include <stdio.h>
#include <string.h>

struct Student{
    int roll_no;
    char name[50];
    float marks;
};

// object oriented programming 
// vs procedural programming

int main(){

    struct Student s1;

    s1.roll_no = 123;
    s1.marks = 85;
    strcpy(s1.name , "FIIT");

    printf("Roll Number : %d \n", s1.roll_no);
    printf("Student marks : %f \n", s1.marks);
    printf("Student Name : %s \n", s1.name);

    struct Student s2;

    s2.roll_no = 18;
    s2.marks = 90;
    strcpy(s2.name , "Redmi");

    printf("Roll Number : %d \n", s2.roll_no);
    printf("Student marks : %f \n", s2.marks);
    printf("Student Name : %s \n", s2.name);

    printf("Structures \n");

    return 0;
}