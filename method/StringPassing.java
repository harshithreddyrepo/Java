package method;

public class StringPassing {
    static String strChange(String str ){
        System.out.println(str.hashCode());
        str = "changd string";
        System.out.println(str.hashCode());
        return str;
    }
    public static void main(String[] args) {
        String str1 = "dependency injuction";
        System.out.println(str1);
        System.out.println(strChange(str1));
        System.out.println(str1);
    }
}
