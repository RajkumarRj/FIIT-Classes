public class App {


    public void pattern1(int n){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=n-i;  j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){

        for(int i=0; i<5; i++){

            for(int j=0; j<i;  j++){
                System.out.print(" ");
            }


            for(int k=1; k<=(2*n-(2*i +1)); k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void pattern3(int n){

        for(int i=1; i<=(2*n-1); i++){

           int stars = i;

           if(i>n)  stars = 2*n-i;

                for(int j=1; j<=stars; j++){
                    System.out.print("*");
                }

            System.out.println();
        }
    }

    public void pattern4(int n){

        int start = 1;
        for(int i=1; i<=n; i++){
            

            if(i % 2 == 0) {
                start = 0;
            }else {
                start = 1;
            }

            for(int j=1; j<=i; j++){
                
                System.out.print(start + " ");
               
                start = 1 -start;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        App obj = new App();
        int n = 5;
        // obj.pattern1(n);
        // obj.pattern2(n);
        // obj.pattern3(n);
        obj.pattern4(n);


    }
}
