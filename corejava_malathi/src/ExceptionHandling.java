public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("Exception");
        int a = 10 ;
        try {  
            int arr[]={1,2,3};
            System.out.println(arr[3]);
            String name = null;
            System.out.println(name.length());
            System.out.println(a / 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Exception handling over");
        }
        System.out.println("handling");
    }
    
}
