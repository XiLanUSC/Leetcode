import java.util.Arrays;
import java.util.Stack;

public class Test151 {
	public static String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(sb.length()!=0){
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()!=0)stack.push(sb.toString());
        String rs = "";
        while(!stack.isEmpty()){
            rs = rs+stack.pop();
            if(!stack.isEmpty())
                rs = rs+" ";
        }
        return rs;
    }
	public static void main(String[] args) {
		
		System.out.println(1|1|21);
	}
}
