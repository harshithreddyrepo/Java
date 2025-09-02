package String;

public class ByteArrayDemo {
    public static void main(String[] args) {
        byte bytes[]={72,101,108,108,111,44,32,104,111,119,32,97,114,101,32,121,111,117,63};
        String str =new String(bytes);
        char []charArray = str.toCharArray();
        byte []byteArray = str.getBytes();
        for(int i:byteArray)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(char i:charArray)
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(str);
//        byte []strAsByteArray = new byte[str.length()];
//        strAsByteArray = str.getBytes();
//        for(int i=0;i<strAsByteArray.length;i++)
//        {
//            System.out.print(strAsByteArray[i]+" ");
//        }
    }
}
