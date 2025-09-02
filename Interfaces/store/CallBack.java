package Interfaces.store;
//MODEL:
//create a store entity and customer entity.
//some of the customers can register and have membership in the store.
//when ever there are sales or offers the respective customer who had membership should be informed.

interface member
{
    void callback();
}

class Customer implements member
{
    String name;
    public Customer(String name)
    {
        this.name=name;
    }

   public void callback()
   {
       System.out.println("The sale is started "+name);
   }
}

class Store
{
    member []arr = new member[100];
    int count = 0;
    public void register(member m)
    {
        arr[count]=m;
        count++;
    }

    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            arr[i].callback();
        }
    }
}

public class CallBack {
    public static void main(String[] args) {
        Store sriMore = new Store();
        Customer mahesh = new Customer("Mahesh");
        Customer rajashekar = new Customer("Rajashekar");
        Customer harshith = new Customer("Harshith") ;
         sriMore.register(mahesh);
         sriMore.register(rajashekar);
        sriMore.inviteSale();


    }
}
