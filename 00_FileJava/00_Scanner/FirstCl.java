import java.util.*;

public class FirstCl{
    public static void main(String[] args){
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        t=sc.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();        
        }
        sc.close();
        for(int i=0;i<t;i++){
            System.out.print(arr[i]+" ");
        }
    }
}