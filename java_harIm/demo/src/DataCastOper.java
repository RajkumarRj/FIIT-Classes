public class DataCastOper {

    public static void main(String[] args) {
        System.out.println("hello there ");

        // data types => primitive & non-primitive

        // primitive => int, float, double, long 
        // int data = 10 ;

        // int => 4 bytes   , 1 bytes => 8 bit 
        // long => 8 bytes , 
        // float => 4 bytes , decimal point -> 10.8 , 8.9999
        // double=> 8 bytes , 

        // char s = '1';  
        // boolean isEligible = true;

        // non-primitive data type 
        // String fiit = "Python full stack ";
        // String academy ="Java";

        // typecasting -> change from one data type to another 

        // implicit => manages by compiler
        // int data = 10;
        // double implicit = 5.67;

        // implicit = data;

        // System.out.println(data);
        // System.out.println(implicit);
        // explicit => manages by user/developer.

        // data = (int)implicit;

        // System.out.println(data);
        // System.out.println(implicit);

        // operators => unary , binary , ternary 

        // int a= 10;
        // unary operator => ++, -- (increment , decrement)
        // System.out.println(a++);
        // System.out.println(++a);
        // System.out.println(a--);
        // System.out.println(--a);
        // System.out.println(a);

        // binary operator => two operand 

        // arithmetic , relational, logical, assignment, bitwise 

        // arithmetic => +, -, *, /, %
        int a = 10;
        int b= 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); //reminder
        
        
        // relational => > , <, >=, <=, != , ==
        System.out.println(a>b);
        // true or false, 
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);

        // logical operator => && || !

        if(true || false) {
            System.out.println("True");
        }

        if(true){
            System.out.println(!false);
        }

    }
}
