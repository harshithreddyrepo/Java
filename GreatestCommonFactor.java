public class GreatestCommonFactor {
    public static void main(String[] args) {
        System.out.println(GCD(16,64));
    }

    static int GCD(int a, int b) {
        int gcd=0;
        if(a<=b) {
            for(int i=1;i<=a;i++) {
                if(a%i==0) {
                    if(b%i==0) {
                       gcd=i;
                    }
                }
            }
        }
        else {
            for(int i=1;i<=b;i++) {
                if(b%i==0) {
                    if(a%i==0) {
                        gcd=i;
                    }
                }
            }
        }
        return gcd;
    }

}
