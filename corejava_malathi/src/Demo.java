public class Demo{


    public static void main(String[] args) {


        System.out.println("Malathi");

        int data = 10;
        long salary = 40000;

        float result = 89;

        double percentage = 90.89;

        boolean isEligible = true;

        char singleLetter = 'M';

        String name = "Malathi";


        // System.out.println(data);
        // System.out.println(salary);
        // System.out.println(result);
        // System.out.println(percentage);
        // System.out.println(isEligible);
        // System.out.println(singleLetter);
        // System.out.println(name);

        // operators = > special symbols that tells compiler to do specific task 

        // unary , binary, ternary 

        // unary => ++, -- ( need one operad)

        int a = 10 ;


        a++;
        a--;
        a--;

        System.out.println(a);


        // binary => arithmetic, relational, logical, assignment, bitwise
        // (atleast need two operand)

        int one = 30;
        int second = 30;


        // System.out.println(one + second);

        // System.out.println(one - second);
        // System.out.println(one * second);
        // System.out.println(one / second);
        // System.out.println(second % one);


        // relational operator => >, < , >=, <=, ==, !=

        // System.out.println(one > second);
        // System.out.println(one < second);

        // System.out.println(one >= second);

        // System.out.println(one <= second);

        // System.out.println(one == second);

        // System.out.println(one != second);

        // logical operators => && , ||, !


        // System.out.println(one >10    &&    second <= 30);
        // System.out.println(true && false);


        // System.out.println(true || false);

        // System.out.println(!true);

        one += 10;

        one -= 10;

        one*=100;
        one /= 100;

        one %= 50;

        System.out.println(one);

        // bitwise operator => & , |, ^,  >> , << , ~


        
        one = 4 ;
        second = 5;
        
        System.out.println(one & second);

        System.out.println(one | second);

        System.out.println(one ^ second);

        System.out.println( "hello " +(one << 1));
        
        System.out.println( "hello " +(one >> 1));




        

    }
}