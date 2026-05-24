package admin;

import user.Accessspecificier;


class ProtectedExample extends Accessspecificier{
    


}


public class AdminSpecifer  {

    public static void main(String[] args) {
        
        Accessspecificier  obj = new Accessspecificier();

        // obj.display();

        // System.out.println(obj.name);
        obj.greet();


        // ProtectedExample obj1 = new ProtectedExample();

        // System.out.println(obj1.name);

    }
    
}
