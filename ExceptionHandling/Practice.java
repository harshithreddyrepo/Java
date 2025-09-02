package ExceptionHandling;

public class Practice {
        static void meth1(int a,int b) throws Exception{
            try {
                System.out.println(a/b);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            System.out.println("Hello world");


        }
        public static void main(String[] args) {
//       String str="   abb      bcc      caa    ";
//        System.out.println((str.replaceAll("\\s+"," ")).trim());
//        int a = 10;
//        System.out.println(String.format("%s",Integer.toBinaryString(a)));
//        System.out.println(Integer.toBinaryString(a>>1));

            try{
                meth1(10,0);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
