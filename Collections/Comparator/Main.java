package Collections.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private final String name;
    private final int rollNo;
    private final double cgpa;
    Student(String name,int rollNo,double cgpa){
        this.name=name;
        this.rollNo=rollNo;
        this.cgpa=cgpa;
    }
    public String getName() {
        return name;
    }
    public int getRollNo(){
        return rollNo;
   }
   public double getCgpa(){
        return cgpa;
   }
}

//Method 1:-Class implementing Comparator interface.
class StudentComparator implements Comparator<Student>{
    @Override
    //Comparison Based on the Roll Number
    public int compare(Student o1, Student o2) {
        return o1.getName().length()-o2.getName().length(); //ASCENDING ORDER
    }
}

public class Main {
    public static void main(String[] args) {
      Student s1=new Student("Srija",6745,8.6);
      Student s2=new Student("Harshith",6753,8.75);
      Student s3=new Student("Nihith",6723,8.5);
      List<Student> list=new ArrayList<>();
      list.add(s1);
      list.add(s2);
      list.add(s3);
      StudentComparator compare = new StudentComparator();
      list.sort(compare);
      System.out.println("Sorted based on length of the name:");
      for (Student s:list){
          System.out.println("Name:"+s.getName()+"  Roll No:"+s.getRollNo()+"  CGPA:"+s.getCgpa());
      }
        System.out.println();
      System.out.println("Sorted based on CGPA:");
     //Method 2:- Using Lambda Expression
     list.sort((o1,o2)->{
         if((o1.getCgpa()-o2.getCgpa())>0){
             return -1;
         } else if ((o1.getCgpa()-o2.getCgpa())<0) {
             return 1;
         }else {
             return 0;
         }
     });
      for (Student s:list){
            System.out.println("Name:"+s.getName()+"  Roll No:"+s.getRollNo()+"  CGPA:"+s.getCgpa());
        }


        System.out.println();
        System.out.println("Sorted based on Roll number then name");
      list.sort(Comparator.comparing(Student::getRollNo).reversed().thenComparing(Student::getName));
        for (Student s:list){
            System.out.println("Name:"+s.getName()+"  Roll No:"+s.getRollNo()+"  CGPA:"+s.getCgpa());
        }
    }
}
