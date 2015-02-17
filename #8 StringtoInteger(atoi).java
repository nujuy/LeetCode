public class Solution {
    public int atoi(String str) {
        if(str == null ||str.length()==0){
            return 0;
        }
        
        String s = str.trim();
        
        int sign = 1;
        int result = 0;
        
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        
        int i = 0;
        if (s.charAt(i) == '+'){
            i++;
        }else if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        
        for (; i<s.length();i++){
            
            char  digit = s.charAt(i);
            
            if(digit >= '0' && digit <= '9' ){
                //判断是否有溢出
                if (result > intMax/10 || (digit - '0') > intMax - result * 10){   
                    //since we have not add sign, so juts consider positive case
                    
                    return sign == -1? intMin : intMax;
                }
            
                result = result * 10 + (digit - '0'); //digit to Int
            }
            
            
            
            else{ 
                break;
            }
        }
     
        return sign * result;
    }
}
