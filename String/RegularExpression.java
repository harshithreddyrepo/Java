package String;

//This concept is used to validate the input provided by the user

public class RegularExpression {
    public static void main(String[] args) {
        /* public boolean matches(String regex) */
        System.out.println("matches(regularExpression) Method is used to verify whether the String matches the given pattern or Regular expression ");
        String str1="f";
        System.out.println(str1.matches("."));

        str1="a";//b,c
        System.out.println(str1.matches("[abc]"));

        str1="p";//true for alphabets other than abc
        System.out.println(str1.matches("[^abc]"));

        str1="7";//A,a7
        System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]

        str1="b";
        System.out.println(str1.matches("a|b"));

        str1="b";
        boolean flag=str1.matches("\\w");
        System.out.println(flag);

        str1="5";
        System.out.println(str1.matches("\\d"));

        str1="$";
        System.out.println(str1.matches("\\D"));

         str1="abcdef";//ab6cdef,abBcdef
        System.out.println(str1.matches("[abc]*"));


        str1="accbdefg";//accb
        System.out.println(str1.matches("[abc]{3,7}"));

        str1="john@gmail.com";
        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));

        str1="ab";  // returns false
        System.out.println(str1.matches("[abc]?"));
    }
}





