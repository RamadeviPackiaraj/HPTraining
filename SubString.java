import java.util.*;
public class SubString{
    public static void FindSubStringFirstOccurance(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    break;
                }
            }if(j==m){
                System.out.println("Find the First Occurance: "+i);
                return;
            }
        }
            System.out.println(-1);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        FindSubStringFirstOccurance(s1,s2);
    }
}