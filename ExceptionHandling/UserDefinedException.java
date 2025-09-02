package ExceptionHandling;
class InvalidAgeException  extends Exception // class representing custom exception
{ public InvalidAgeException (String str) {
    super(str);// calling the constructor of parent Exception

  }
}
public class UserDefinedException  // class that uses custom exception InvalidAgeException
{
    static void validate(int age) throws InvalidAgeException// method to check the age
    {
        try{
            if (age < 18) {
                throw new InvalidAgeException( "age is not valid to vote");// throw an object of user defined exception
            } else {
                System.out.println("welcome to vote");
            }
        }
        finally {
            System.out.println("WELCOME");
        }
    }
    // main method
    public static void main(String[] args) {
        try {
            validate(13);// calling the method
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + ex);// printing the message from InvalidAgeException object
        }
        System.out.println("rest of the code...");
    }
}
//Important : take a look at finally block in validate()
//CONCLUSION : finally block is used when you are not confident about weather you handled all the exceptions
// in catch block and the code after it should, must execute.

