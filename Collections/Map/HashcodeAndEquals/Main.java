package Collections.Map.HashcodeAndEquals;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashMap<Employee,String> map=new HashMap<>();
        Employee e1=new Employee("Mahesh",6701);
        Employee e2=new Employee("Harshith",6702);
        Employee e3=new Employee("Mahesh",6701);

        map.put(e1,"Designer"); // hashcode1 --> index1
        map.put(e2,"Developer"); // hashcode2 --> index2
        map.put(e3,"Manager");  // hashcode1 --> index1 --> equals --> replace

/*
//        String p1="Harshith";//Hashcode of p1:194967375
//      //  String p2="Mahesh";  //Hashcode of p2:-1997742138
//       String p2="Harshith"; //Hashcode of p2:194967375
        String p1=new String("Harshith");  //Hashcode of p1:194967375
        String p2=new String("Harshith");  //Hashcode of p2:194967375
        System.out.println("Hashcode of p1:"+p1.hashCode());
        System.out.println("Hashcode of p2:"+p2.hashCode());
Take away: String class has its own implementation of hashCode() rather than depending on the address.
     System.out.println(e1);
       System.out.println(map); //{id:6702,name:Harshith=Developer, id:6701,name:Mahesh=Manager}
*/
        System.out.println("HashMap Size:"+map.size());
//        System.out.println("Value for e1:"+map.get(e1));
//        System.out.println("value for e2:"+map.get(e2));
//        System.out.println("value for e3:"+map.get(e3));
        System.out.println(map);
    }
}

class Employee{
    private String name;
    private int id;
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
        /*
          public static int hash(Object... values) {
          return Arrays.hashCode(values);
        }

        public static int hashCode(Object[] a) {
        if (a == null)
            return 0;

        int result = 1;

        for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }
         */
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Employee other=(Employee)obj;
        return id==other.getId()&& Objects.equals(name,other.getName());
         /*
          public static boolean equals(Object a, Object b) {
          return (a == b) || (a != null && a.equals(b));
         }
         */
    }

    @Override
    public String toString() {
        return "id:"+id+",name:"+name;
    }
}
