import java.util.*;
public class wordto {
    public static void main(String[] args) {
        String ans="My name is Soham";
        String[] words=ans.split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
}
