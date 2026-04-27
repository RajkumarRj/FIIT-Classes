public class ExceptionHandling {

    public static void main(String[] args) {
        
        int a =10;
        int b = 0;
        int c;
        String input = "123p";
        try{
            // int arr[] = null;
            // System.out.println(arr[0]);
            int number = Integer.parseInt(input);
            System.out.println(number);
            // int arr[]={1,2};
            // System.out.println(arr[10]);
            // c = a/b;
            // System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException  e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally passed through expections");
        }
        System.out.println("End");

    }
    
}
