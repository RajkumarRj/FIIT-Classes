#include <stdio.h>
#include<string.h>

union Data{
    int roll_no;
    float marks;
    char name[20];
};


int main(){
    printf("Hello there\n");

    union Data dt;

    dt.roll_no = 1;
    printf("%d\n", dt.roll_no);
    
    dt.marks = 100;
    printf("%f\n",dt.marks);

    strcpy(dt.name , "Ganesh");
    printf("%s\n", dt.name);

    printf("%lu\n", sizeof(dt) );

    return 0;
};