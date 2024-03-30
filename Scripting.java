public class Scripting {
    public static void main(String[] args) {
        System.out.println("Telugu Script:");
        for(int i=0x0c00;i<=0x0c7F;i++)
        {
            System.out.print("\t"+(char)i);
        }
        System.out.println("Devanagari Script:");
        for(int i=0x0900;i<=0x097f;i++)
        {
            System.out.print("\t"+(char)i);
        }

    }
}
