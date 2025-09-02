package String;

public class equalsVsDoubleEqual {
    public static void main(String[] args) {

       // int n1=10;
       // int n2=10;
      //  System.out.println(n1==n2);

//        Integer int1 = 10;
//        Integer int2 = 20;
//        System.out.println(int1.hashCode());
//        System.out.println(int2.hashCode());
//
//        System.out.println(int1==int2);
//        System.out.println(int1.equals(int2));
//
//        String str1="harshith";
//        String str2="harshith";
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//
//        String name1 = new String("Chinnu");
//        String name2 = new String("Chinnu");
//        System.out.println(name1.hashCode());
//        System.out.println(name2.hashCode());
//
//        System.out.println(name1==name2);
//        System.out.println(name1.equals(name2));

        String str1 = new String("harshith");
        String str2 = str1;
        System.out.println(str2 == str1);

        String str3 = new String("harshith");
        System.out.println(str1==str3);

        System.out.println("Hashcode of str1:"+str1.hashCode());
        System.out.println("Hashcode of str3:"+str3.hashCode());

    }
}

//Conclusion : HashCode is not referred to the address of the object created in side heap
// Hashcode is a string that is generated for the every object created inside the heap using some special algorithm depending on the contents of the object...
//obj1==obj2 returns true only if both the reference holds the same object