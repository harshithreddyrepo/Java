package String;

public class Challenge {

    public static void main(String[] args) {
        //Q1.Remove all the special characters
        String str= "a&B%c*1#2$%5^";
       // System.out.println(str.replaceAll("[^0-9a-zA-Z]",""));
        System.out.println(str.replaceAll("\\W",""));

        //Q2.Remove all the spaces
        str="   Harshith   Reddy    Akkati  ";
        System.out.println(str.replaceAll("\\s",""));

        //**Replace the multiple spaces with single space and remove leading and trailing spaces
        String name=str.replaceAll("\\s+"," ").trim();
        System.out.println(name);

        //Q3.Count number of words
        //**public String[] split(String regex) method is used
        System.out.println("split(regex) returns an String array and it split the words based on provided regex");
        String []arr=name.split("\\s");
        System.out.println("No. of words in "+name+"="+arr.length);



    }
}
