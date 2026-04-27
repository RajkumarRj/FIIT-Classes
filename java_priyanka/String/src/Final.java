final class finaled{

    final double  PI = 3.14;
    final void display(){
        System.out.println("Final method");
    }
}
//final in field=> doesn't allow to modify the values 
// final in method => doesn't allow to override 
// final in class => doesns't allow to inherit 

class inherited extends finaled{
    void display(){
        System.out.println("Inherited class");
    }

}

public class Final {

    public static void main(String[] args) {


        finaled obj = new finaled();

        // obj.PI =40;

        // System.out.println(obj.PI);

        inherited inherit = new inherited();

        inherit.display();
        
    }
}
