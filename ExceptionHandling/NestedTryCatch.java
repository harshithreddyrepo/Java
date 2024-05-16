package ExceptionHandling;

public class NestedTryCatch {

        public static void main(String[] args) {


            try
            {
                int []arr = new int[]{0,1,2,3,4};
                try
                {
                    int c =arr[1]/arr[0];
                }
                catch (ArithmeticException e)
                {
                    System.out.println(e);
                }

                System.out.println(arr[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

            System.out.println("program terminates smoothly");

        }
    }


