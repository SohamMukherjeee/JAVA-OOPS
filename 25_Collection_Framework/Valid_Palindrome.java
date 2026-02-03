import java.util.*;
public class Valid_Palindrome {
public static void main(String[] args) {
	String s="[{(])}]";
    Stack<Character> st = new Stack<>();
	char[] s1=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		char ch=s1[i];
		if(ch=='(' || ch=='[' || ch=='{') {
			st.push(ch);
		}else if(!st.isEmpty()) {
			if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')) {
				st.pop();
			}else {
				System.out.println("false 1");
				return;
			}
		}else {
			System.out.println("false 2");
			return;
		}
	}
    System.out.println(st.isEmpty() ? "true" : "false");
}
}
