public class polyAbstractInter {

    public  polyAbstractInter(){
        System.out.println("Default constructor or no argument ");
    }

    public polyAbstractInter(String name, String password ){
        System.out.println(name +" "+password);
    }
    public  void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public  void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        System.out.println("Polymorphism");
        // polyAbstractInter.class =>byte code 

        polyAbstractInter obj = new polyAbstractInter();

        obj.add(10,20 , 30);
        obj.add(10,20 );

        polyAbstractInter obj1 = new polyAbstractInter("FIIT", "1234");

        // polymorphism => same method name with different implemention 

        // polymorphism =? compile-time (method overloading) same class , run-time (method overriding) different class 
    
    }
    
}
