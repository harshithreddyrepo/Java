package LambdaExpression.MethodReference;

interface Show{
    void display(String str);
}

// Traditional approach:
  class Extra implements Show{

    @Override
    public void display(String str) {
        System.out.println(str);
    }
}


public class Main {
    public static void main(String[] args) {

       // Traditional approach
         Extra extra = new Extra();
         extra.display("Hello");

       // Lambda Expression
       Show show = (str)-> System.out.println(str);
       show.display("Welcome");

       // Method Reference
        Show display = System.out::println;
        display.display("Thank you");

    }
}
