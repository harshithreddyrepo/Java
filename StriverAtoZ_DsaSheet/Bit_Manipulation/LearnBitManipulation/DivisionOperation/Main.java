package StriverAtoZ_DsaSheet.Bit_Manipulation.LearnBitManipulation.DivisionOperation;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(-1,1));
    }
    public static int divide(int dividend, int divisor) {
        int i=0,result=0;
        int sor=divisor>0?divisor:(-divisor);
        int end=dividend>0?dividend:(-dividend);
        while((sor<<i+1) <= end){
            i++;
        }
        while(i>=0){
            if(end >= (sor<<i)){
                result=result+(1<<i);
                end=end-(sor<<i);
            }
            i--;
        }

        if((dividend<0)^(divisor<0)){
            return -result;
        }else{
            return result;
        }


    }
}
