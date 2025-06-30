import java.util.*;
public class Main{
    public static String ArrangeMinMax(int[] arr){
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        int left=0;
        int right=arr.length-1;
        int mid=left+(right-left)/2;
        while(left<right){
            sb.append(arr[right]+" ");
            sb.append(arr[left]+" ");
            left++;
            right--;
        }
        if(arr.length%2!=0){
        sb.append(arr[mid]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println(ArrangeMinMax(arr));
    }
}