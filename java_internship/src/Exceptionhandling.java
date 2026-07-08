public class Exceptionhandling {

    public static void main(String[] args) {
        
        System.out.println("Runtime");


        int a = 5;
        // exceptional handling

        try {

            int arr[] = {1,2,3};
            String name = null;
            System.out.println(name.length());
            System.out.println(arr[5]);       
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("After exceptional handling");
        }
        System.out.println("Runtime");
    }
    
}
