package LocalInnerClass;

public class OuterClass {
    public void display()
    {
        class demo extends Sample
        {
            public void show()
            {
                System.out.println("inside the overridden method of local inner class");
            }

        }

        demo obj = new demo();
        obj.show();
    }

}
