import java.util.*;
public class StackhalfIndex{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int j=n/2;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n/2;i++){
           st.push(arr[i]);
           if(j<n){
           st.push(arr[j]);
           j++;
           }
        }
        System.out.println(st);
    }
}// output 1 4 2 5 3 6