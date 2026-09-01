public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // statically typed language 
      

    //    collection of same data types  
        // arrays => 

            // int  marks[] = {85,90,56,75};

            // System.out.println(marks[0]);
            // System.out.println(marks[1]);
            // System.out.println(marks[2]);

            // marks[0] = 100;


            // loops 

            // System.out.println(marks.length);

            // for(int i=0; i<marks.length; i++){
            //     System.out.println(marks[i]);
            // }

            // for(int mark : marks){
            //     System.out.print(mark + " ");
            // }


            
            // int sum =0;
            // for(int mark : marks){
            //     sum += mark;
            // }

            // System.out.println(sum);

            // search an element in an array => 90

            // int searchValue = 900;
            // boolean found = false;

            // for(int mark : marks){

            //     if(mark == searchValue){
            //         found = true;
            //         break;
            //     }
            // }

            // System.out.println(found ? "match found":"Not found");


            // dynamically typed language

            // let a = 10;

            // a = "FIIT"

            // log(a)  => FIIT

            // 2d array 

            // int matrix[][] = { {10,20}  , {40,50,60,90}  , {70,80,90,100}, {10} };

            

            // for(int i=0; i<matrix.length; i++){

            //     for(int j=0; j<matrix[i].length; j++){
            //         System.out.print(matrix[i][j] +" ");
            //     }

            //     System.err.println();
            // }

            // strings 
            // String => class 

            String name = "FIIT";  // string literal
            String name2 = "FIIT";

            System.out.println(name == name2); //true



            System.out.println(name);

            String name1 = new String("FIIT"); // new keyword

            System.out.println(name == name1); //false

            System.out.println(name1);


            // == checks for refrence 
            // equals = checks for value

            System.out.println(name.equals(name1)); //true


            // string is imumutable object  

            System.out.println(name.length());
            

         

            

    }
}
