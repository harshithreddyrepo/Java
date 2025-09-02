package Collections.Comparable;

import java.util.ArrayList;
import java.util.Objects;

class Student implements Comparable<Student>{
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        Student s=(Student)obj;
        return getGpa()==s.getGpa()&&getName().equals(s.getName());
    }

    @Override
    public int hashCode() {
       return Objects.hash(name,gpa);
    }

    @Override
    public String toString() {
        return ("name:"+getName()+",GPA:"+getGpa());
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.gpa,o.gpa);  // ASCENDING ORDER 4.compareTo(3) required output:3,4 i.e +ve :- this.gpa-o.gpa
       // return Double.compare(o.gpa,this.gpa); // DESCENDING ORDER 3.compareTo(4) required output +ve:4,3 i.e +ve :- o.gpa-this.gpa
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Srija",8.5);
        Student s2=new Student("Harshith",8.75);
        Student s3=new Student("Nihtih",8.4);
        ArrayList<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.sort(null);
        System.out.println(students);
    }
}
