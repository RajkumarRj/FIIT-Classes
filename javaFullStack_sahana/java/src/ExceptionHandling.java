

public class ExceptionHandling {



    public static void main(String[] args) {

       int a = 10;
       int arr[]={1,2,3};

       String s = null;
       String num = "abc";
       
       try {
        //    System.out.println(a/0);
        // System.out.println(arr[5]);
        // System.out.println(s.length());
        System.out.println(Integer.parseInt(num));


       }catch(ArithmeticException obj) {
        System.out.println(obj.getMessage());
       }catch(ArrayIndexOutOfBoundsException obj){
        System.out.println(obj.getMessage());
       }catch(NullPointerException obj){
        System.out.println(obj.getMessage());
       }catch(NumberFormatException obj){
        System.out.println(obj.getMessage());
       }catch(Exception e){
        System.out.println(e.getMessage());
       }

    //    Exception obj = new Exception();

       System.out.println("Below exception");
       System.out.println("Below exception");
        
      
    }
    
}
