import java.util.*;
public class Stock_Span{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] span=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
           span[i]=(st.isEmpty())?(i+1):(i-st.peek());
           st.push(i);
        }
        for(int s:span){
            System.out.print(s+" ");
        }
    }
}