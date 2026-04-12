public class Constructor {

     String name;
     int age;

    Constructor(){
        System.out.println("Constructor is called");
    }

    Constructor(String name , int age){
        this.name = name;
        this.age = age;
    }

    Constructor(Constructor obj){

        this.name = obj.name;
        this.age = obj.age;
    }


    

    public static void main(String[] args) {
        
        Constructor obj = new Constructor("Fiit", 24);

        Constructor obj1 = new Constructor(obj);

        System.out.println(obj1.age);
        System.out.println(obj1.name);

        // int data =10;





        // int data = 10;

        // data = "fiit";

        // java => static typed language 

        // System.out.println(data);


        


        // defautl constructor 
        // parameterized constructor 
    }
}
