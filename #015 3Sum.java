public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> = new List<List<Integer>>();
        
        if(num.length<3)
            return result;
        
        // sort array
	    Arrays.sort(num);
	    
	    for(int i = 0; i< num.length()){
	        //avoid duplicate solution
	        if( i==0 || num[i] > num[i-1]){
	            int neg = num[i];
	            int start = i+1;
	            int end = num.length()-1;
	            
	            while (start>end){
	                //case 1
	                if (num[start]+num[end] = neg){
	                    ArrayList<Integer> temp = new ArrayList<Integer>();
	                    temp.add(num[i]);
	                    temp.add(num[start]);
	                    temp.add(num[end]);
	                    
	                    result.add(temp);
	                    start++;
	                    end--;
	                    
	                    //avoid duplication
	                    while(start<end && num[end] == num[end+1])
	                        end--;
	                    while(start<end && num[start] == num[start-1])
	                        start++;
	                }
	                //case 2
	                else if(num[start]+num[end] < neg){
	                    start++;
	                }
	                else{
	                    end--;
	                }
	            }
	        }
	    }
	    return result;
    }
}
