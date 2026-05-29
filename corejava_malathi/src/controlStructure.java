public class controlStructure {

    public static void main(String[] args) {
        // control structure 

        // conditional statement and loops

        // conditional statement => if, if else, else-if, nested if, switch


        int age = 18;


        if(age >= 18){
            System.out.println("You are eligible for vote");
        }else{
            System.out.println("You are not eligible for vote ");
        }

        boolean voterId = false;


        // nested if 
        if(age >=18){

            if(voterId){
                System.out.println("you are eligible for vote");
            }else{
                System.out.println("you don't have voter id");
            }
        }else{
            System.out.println("you age is less than 18");
        }

        int marks =60;
        



       
    }
}
