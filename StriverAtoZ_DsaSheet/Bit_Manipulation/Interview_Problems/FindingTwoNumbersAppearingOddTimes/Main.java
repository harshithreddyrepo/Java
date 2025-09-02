package StriverAtoZ_DsaSheet.Bit_Manipulation.Interview_Problems.FindingTwoNumbersAppearingOddTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {42,34,52,45,15,23,23,22,22,34,52,15,934,23,22,43,9,23,23,23,23,45,9,34,22,22,22,52,34,23,34,43,23,23,34,22,22,9,52,43,27,34};
        List<Integer> list= oddNumbersUsingHashing(arr);
        System.out.println(list);
        System.out.println(Arrays.toString(twoOddNum(arr,arr.length)));
    }
    public static List<Integer> oddNumbersUsingHashing(int[] arr){
        Map<Integer,Integer> map = new Hashtable<>();
        for(int key:arr){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:entries){
            if(entry.getValue()==1){
              list.add(entry.getKey());
            }
        }
       // System.out.println(map);
        return list;
    }
 //BUCKET TECHNIQUE
    public static int[] twoOddNum(int Arr[], int N)
    {
        int xor=xoR(Arr);
        int rmsb=xor^(xor&(xor-1));
        int j=0,k=0;
        int[] arr1=new int[N], arr2=new int[N];
        for(int i:Arr){
            if((i&rmsb)!=0){
               arr1[j++]=i;
            }else{
                arr2[k++]=i;
            }
        }
        int m=xoR(arr1),n=xoR(arr2);
        if(m>n){
            return new int[]{m,n};
        }
        else{
            return new int[]{n,m};
        }
    }
    public static int xoR(int[] arr){
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        return xor;
    }
}
