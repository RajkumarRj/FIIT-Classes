package package2;

import package1.user;

public class admin  extends user{

    public static void main(String[] args) {
        user obj1 = new user();

        // System.out.println(obj1.rollno);
        // System.out.println(obj1.salary);

        System.out.println(obj1.role);


        admin obj = new admin();

        System.out.println(obj.salary);

    }
    
}
