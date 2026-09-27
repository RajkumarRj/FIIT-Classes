package shipping;

import payment.CustomerOrder;

public class DeliveryTrack  extends  CustomerOrder{

    public static void main(String[] args) {

        DeliveryTrack obj = new DeliveryTrack();
        

        System.out.println(obj.productName);

        System.out.println(obj.price);
        
        // CustomerOrder obj = new CustomerOrder();

        // System.out.println(obj.creditCard);
        
        // System.out.println(obj.customerName);
        // System.out.println(obj.productName);

    }
    
}
