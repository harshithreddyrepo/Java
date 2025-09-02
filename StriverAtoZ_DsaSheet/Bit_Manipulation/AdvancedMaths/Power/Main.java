package StriverAtoZ_DsaSheet.Bit_Manipulation.AdvancedMaths.Power;

class Main {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000,-2147483648));
    }
    public static double myPow(double x, int n) {
       // long power=n;
        double base=x;
        long pow=n>0?n:-n;
        double result=1;
        while(pow>0){
            if((pow&1)==1){
                result=result*base;
            }
            pow=pow>>1;
            base=base*base;
        }
        if(n>0){
            return result;
        }else{
            return 1.0/result;
        }
    }
}