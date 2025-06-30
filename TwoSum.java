import java.util.*;
public class Main{
    public static int[] MainPro(int[] arr,int target){
        int num=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
             num=target-arr[i];
             if(mp.containsKey(num)){
                 return new int[]{num,arr[i],};
             }
             mp.put(arr[i],i);
        }
        return new int[0];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] result=MainPro(arr,target);
        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found that adds up to the target.");
        }    }
}