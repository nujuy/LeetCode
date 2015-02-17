public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() == 1){
            return false;
        }
        
        Stack<Character> x = new Stack<Character>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i) == '[' || s.charAt(i) == '{'){   //是正括号
                x.push(s.charAt(i));
            }else{      //是反括号
                if(x.size()==0)     //  没有正括号在前
                    return false;   //  有正括号 但不匹配
                char top = x.pop();
                if(s.charAt(i) == ')')
                    if(top != '(')
                        return false;
                if(s.charAt(i) == ']')
                    if(top != '[')
                        return false;
                if(s.charAt(i) == '}')
                    if(top != '{')
                        return false;
            }
        }
        
        return x.size()==0;
    }
}
