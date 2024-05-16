package AutomaticIdGenerator;

import java.util.Date;

public class Student {

    private String roll_no;
    private String name;
    private static int count = 1;

    public Student(String name)
    {
        this.name = name;
        roll_no = idGenerator();
    }

    private static String idGenerator()
    {
        Date date = new Date();
        String id = "22641A"+(date.getYear()+1900)+count;
        count++;
        return id;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }
}
