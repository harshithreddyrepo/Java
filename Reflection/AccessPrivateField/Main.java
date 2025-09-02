package Reflection.AccessPrivateField;
import java.lang.reflect.Field;
// Program will throw an exception on online IDE
// Compile and run the program on offline IDE
public class Main {
    public static void main(String[] args)
    {
        try {

            // Student object created
            Student e = new Student("Kapil", 23);

            // Create Field object
            Field privateField = Student.class.getDeclaredField("name");

            // Set the accessibility as true
            privateField.setAccessible(true);

            // Store the value of private field in variable
            String name = (String)privateField.get(e);
            //String name=e.name; - ERROR

            // Print the value
            System.out.println("Name of Student:" + name);
            System.out.println(e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Access Private Field Using Reflection in Java
// Student class declaration
class Student {

    // private fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    private int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override public String toString()
    {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}




