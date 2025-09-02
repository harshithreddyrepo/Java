package String;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Harshith";  // str refers to an object created in pool(String Constant Pool).
        String str1 = new String("Harshith"); // str1 refers to an object created inside Heap.
        System.out.println(str1.equals(str));  // returns true because it verifies the contents inside the String Objects.
        System.out.println(str1==str);  // returns false because it checks verifies the address of String Objects.

        /* public int length() */
        System.out.println("length() Method is used to find the length of the String");
        System.out.println("length of "+str+" is:"+str.length());

        /* public String toLowerCase() similarly toUpperCase()*/
        System.out.println("toLowerCase() Method is used to convert the String into LowerCase");
        //Note:Strings are immutable.
        System.out.println("toLowerCase() Method will create a String object inside the heap and returns it's address");
        //Note:it creates an Object inside heap.
        String str2="harshith";
        str=str.toLowerCase();
        System.out.println("str:"+str+" & str2:"+str2);
        System.out.println(str==str2);  //returns false since the object of str1 is created inside heap

        /* public String trim() */
        System.out.println("trim() Method is used to remove the leading and trailing spaces");
        String str3="    enjoy the life     ";
        System.out.println("before using trim() Method:"+str3);
        System.out.println("after using trim() Method:"+str3.trim());

        /* public String substring(int begin) similarly substring(int begin,int end) */
        System.out.println("substring() is used to get the required part of a String");
        System.out.println("str:"+str);
        System.out.println("str.substring(3):"+str.substring(3));
        System.out.println("str.substring(3,7):"+str.substring(3,7));

        /* public String replace(char old,char new) */
        System.out.println("replace(old,new) method is used to replace the old characters with new characters passed in the string");
        System.out.println("str.replace('h','a') replaces 'h' with 'a':"+str.replace('h','a'));

        /* public boolean startsWith(string str) and startsWith(String str,int beginIndex) similarly endsWith(String str) */
        System.out.println("startsWith(String str) Method is used to check whether the String starts with the passed string");
        str="Mr.Harshith Reddy";
        if(str.startsWith("Mr"))
        {
            System.out.println(str+" is male");
        }
        System.out.println("endsWith(String str) Method is used to check whether the String is ends with the passed string");
        if(str.endsWith("Reddy"))
        {
            System.out.println(str+" belongs to OC");
        }

        /* public char charAt(int index) */
        System.out.println("charAt(index) Method is used to get the character at a particular index");
        System.out.println("str:"+str+" & str.charAt(5):"+str.charAt(5));
        //Note : index numbering starts from Zero.

        /* public int indexOf(string str) & indexof(String str,int beginIndex) => searches from left to right*/
        // similarly public int lastIndexOf(String str) and lastIndexOF(String str,int beginIndex) => searches from right to left side
        System.out.println("indexof('str') Method is used to get the index of string str passed");
        System.out.println("it returns the starting index if the String if it find str  init");
        System.out.println("it returns -1 if the passed str does not exist in the String");
        System.out.println(str);
        System.out.println("str.indexOf("+"H"+"):"+str.indexOf("H"));
        System.out.println("str.indexOf(\"r\",3):"+str.indexOf("r",3));

        /* public boolean equals(String str) and equalsIgnoreCase(String str) */
        System.out.println("equals(Str) Method is used to check whether the contents of both the Strings are same");
        System.out.println("str1:"+str1+" & str2:"+str2);
        System.out.println("str1.equals(str2):"+str1.equals(str2));
        System.out.println("equalsIgnoreCase(str) Method is also used check whether the contents of both the strings are same and it ignores case");
        System.out.println("str1.equalsIgnoreCase(str2):"+str1.equalsIgnoreCase(str2));

        /* public int compareTo(String str) */
        System.out.println("str1.compareTo(str) Method is used to compare the stings in the dictionary order");
        System.out.println("it returns -1 if str1 comes first in the dictionary order else return 1");
        System.out.println("if both the strins are same it returns zero ");
        str1="chinnu";
        str2="bannu";
        System.out.println("str1.compareTo(str2):"+str1.compareTo(str2));

        /* public static String valueOf(xxx value) */
        System.out.println("valueOf() method converts anything into string");
        //Note:valueOf() is a static method
        String wrapper =String.valueOf(true);
        System.out.println(wrapper);

       /* public boolean contains(String str) */
        System.out.println("contains(str) method is used to check whether the String contains str or not ");



    }
}
