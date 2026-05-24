class Encap{
    private int data = 40;

    public void setData(int data){
        this.data = data;
    }

    public int   getData(){
        
        display();
        return data;
    }

    private void display(){
        System.out.println("Private method");
    }

}


public class Encapsulation {

    private int data = 10;




    public static void main(String[] args) {
        System.out.println("Encapsulation");

        Encapsulation obj = new Encapsulation();

        System.out.println(obj.data);



        Encap obj1 = new Encap();

        obj1.display();
        
        obj1.setData(60);
        int result = obj1.getData();
        System.out.println(result);




        // encapsulation -> binding of data (field/variables) with method 
    }
    
}
