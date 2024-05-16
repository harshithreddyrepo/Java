package AutomaticIdGenerator;

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student("Srija");
        System.out.println("Rull No of"+obj1.getName()+" is "+obj1.getRoll_no());
        Student obj2 = new Student("Harshith");
        System.out.println("Rull No of"+obj2.getName()+" is "+obj2.getRoll_no());
        Student obj3 = new Student("Nihith");
        System.out.println("Rull No of"+obj3.getName()+" is "+obj3.getRoll_no());

    }
}
