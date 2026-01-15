import java.util.*;
public class reverseName {
    public static void main(String arrgs[]){
       String ans="Soham";
       char[] arr=ans.toCharArray();
       int i=0;
       int j=arr.length-1;
       while(i<j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       String finalAns=new String(arr);
         System.out.println(finalAns);
    }
}
