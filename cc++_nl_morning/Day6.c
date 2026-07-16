#include <stdio.h>
#include <string.h>
// with argument and with return type 
int add(int x, int y){ // parameter
    int sum = x+y;
    return sum;
}
// without argument and without return type 
void display(){ // function definition
    printf("Display method \n");
}
// with argument and without return type 
void multiply(int a , int b, int c){

    printf("%d \n", a*b*c);
}
// without argument and with return type 
double PI(){
    double pi = 3.14;
    return pi;
} 
struct Student{
    int roll_no;
    char name[50];
    double marks;
};

int main(){
    struct Student classroom[5] = {
            {1,"Rithish", 90},
            {2,"lashveinram" ,95},
            {3, "raj", 80}
    };

    for(int i=0; i<3; i++){
        printf("%d %lf %s \n", classroom[i].roll_no, classroom[i].marks , classroom[i].name);
    } 

    struct Student s2 = {20, "Redmi", 80};
    struct Student s1;
    s1.roll_no = 21;
    s1.marks = 90;
    strcpy(s1.name , "FIIT");

    printf("%d \n", s1.roll_no);
    s1.marks = 100;
    printf("%lf \n", s1.marks);
    printf("%s \n", s1.name);

    printf("%d \n", s2.roll_no);
    printf("%lf \n", s2.marks);
    printf("%s \n", s2.name);

    








    // int a = 10;
    // int *ptr = &a;

    // int **dptr = &ptr;

    // printf("Double pointer : %d \n", **dptr);

    // printf("%p \n", ptr);
    // printf("%d \n", *ptr);
    // int arr[] = {1,2,3,4,5};
    // int *index = arr;
    // for(int i=0; i<5; i++){
    //     // printf("Pointer %d  and i value :%d \n", *index, i);
    //     printf("%d \n", *(index + i));
    // }
    // index++;
    // index++;
    // printf("%d \n", *index);
    // index--;
    // printf("%d \n", *index);

    // double pi = PI();

    // printf("%.2lf \n",pi);

    // multiply(10,20,30);

    // printf("Functions \n");

    // int a =10;
    // int b = 20;

    // int total = add(a, b); // argument 
    // printf("%d \n", total);

    // display(); // function call 


    return 0;
};