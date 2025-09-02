package InnerClasses.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
       ShoppingCart shoppingCart=new ShoppingCart(250);
       CreditCard creditCard = new CreditCard("2323");
       shoppingCart.processPayment(creditCard);
       Payment payment1 = new Payment() {
           @Override
           public void pay(double amount) {
               System.out.println("paid "+amount+" using Axis Credit card.");
           }
       };
       shoppingCart.processPayment(payment1);
       shoppingCart.processPayment(new Payment() {
           @Override
           public void pay(double amount) {
               System.out.println("paid "+amount+" using SBI Credit card.");
           }
       });

       Payment payment2 = amount -> System.out.println("paid "+amount+" using Kotak Mahindra Credit card."); //Lambda Expression
       shoppingCart.processPayment(payment2);
    }
}
