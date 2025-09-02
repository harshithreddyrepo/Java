package Enum;
enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D"),MECH("Vikram");

    String head;
    String location;

    private Dept(String head)
    {
        this.head=head;
        System.out.println(this.head);
    }


    private Dept(String head,String loc)
    {
        this.head=head;
        this.location=loc;
        System.out.println(this.head);
    }

    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

public class ExploreEnum {
    public static void main(String[] args)
    {
        Dept d=Dept.CS;

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());



    }
}





