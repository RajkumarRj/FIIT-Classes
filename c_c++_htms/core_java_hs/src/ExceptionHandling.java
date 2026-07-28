
public class ExceptionHandling {
    public static void main(String[] args) {
        

        System.out.println("Exception handling");


        int a = 10;

        try {

            int arr[] = {1,2,3};
            System.out.println(arr[10]);
            String name = null;
            System.out.println(name.length());
            System.out.println(a/0);

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Exception handling over");
    }
    
}
