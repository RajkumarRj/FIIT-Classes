class Excpt{

    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied");
        }
    }
}


public class App {



    
    public static void main(String[] args) throws Exception {

        // Excpt obj = new Excpt();

        // obj.checkAge(20);

        // Excpt.checkAge(2);

        
        // exception => arithmetic, .... 

        try {
            String s = "hello";

            int num = Integer.parseInt(s);

            System.out.println(num);
            int arr[] = new int[5];

            arr[10] = 50;
            
            int result = 10/0;

        } catch(ArithmeticException obj) {
            System.out.println(obj.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException obj){
                System.out.println("Invalid number");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("exception handling passed");
        }


        System.out.println("End of the program ");


        // check exception and unchecked exceptions 

        // checked exception => checked at compile time 
        // examples => ioexception, sqlexception
        
        
        // unchecked exception => checked at runtime 
        // occur due to programming errors ,

        // examples => arithmeticexpression ,
        // arrayindexOutofBoundexception 













    }
}
