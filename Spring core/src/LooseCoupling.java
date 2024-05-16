
// Strategy design pattern: Always code to interface for the services that are being used in the Business logic/Service layer
interface DeliveryService
{
    boolean deliverProduct(double amount);
}

class FedEx implements DeliveryService
{
  public boolean deliverProduct(double amount)
  {
      System.out.println("The product is delivered by FedEx service and the amount paid is "+amount);
      return true;
  }

}

class DHL implements DeliveryService
{
    public boolean deliverProduct(double amount)
    {
        System.out.println("The product is delivered by DHL service and the amount paid is "+amount);
        return true;
    }

}

class BlueDart implements DeliveryService
{
    public boolean deliverProduct(double amount)
    {
        System.out.println("The product is delivered by BlueDart service and the amount paid is "+amount);
        return true;
    }

}


// TARGET CLASS
class Amazon{
    DeliveryService service;
    public Amazon(DeliveryService service)
    {
        this.service = service;
    }
    boolean deliverTheProduct(double amount){
        return service.deliverProduct(amount);
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        FedEx fedex = new FedEx();
        DHL dhl = new DHL();
        BlueDart blueDart = new BlueDart();

        Amazon amazon = new Amazon(blueDart);  // BlueDart => DEPENDENT OBJECT
        amazon.deliverTheProduct(2000);
    }
}
