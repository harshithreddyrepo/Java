package method;

// we can not pass non-static variables or instances to the static method.
// But we can pass the variables that are initialized in the method to a static method.



class Add{
    public static int add(int n,int m){
        return (n+m);
    }
}

public class PassingParametersToStaticMethod {
    int num = 20;  // instance variable (non-static)
    void addTwoNumbers()
    {
        int a = 10;
        int b = 20;
        System.out.println(Add.add(a,b));
    }
    public static void main(String[] args) {
        int a = 10;   // variable initialised in static method
        int b = 15;   // variable initialised in static method

        System.out.println(Add.add(a,b));
        PassingParametersToStaticMethod obj = new PassingParametersToStaticMethod();
        obj.addTwoNumbers();


    }
}
