package ExceptionHandling;

// class representing custom exception
class InvalidAgeException  extends Exception
{

    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class UserDefinedException {

    // method to check the age
    static void validate(int age) throws InvalidAgeException {
        try{
            if (age < 18) {

                // throw an object of user defined exception
                throw new InvalidAgeException( "age is not valid to vote");
            } else {
                System.out.println("welcome to vote");
            }
        }
        finally {
            System.out.println("WELCOME");
        }
    }

    // main method
    public static void main(String args[]) {
        try {
            // calling the method
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
}
//Important : take a look at finally block in validate()
//CONCLUSION : finally block is used when you are not confident about weather you handled all the exceptions
// in catch block and the code after it should, must execute.

