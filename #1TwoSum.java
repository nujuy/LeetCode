public class Solution{
  public int[] twoSum(int [] numbers, int target){
    int[] num = numbers.clone(); //copy the given array and sort
    Arrays.sort(num);
    
    int length = numbers.length;
    int left = 0;
    int right = length - 1;
    int sum = 0;
    
    ArrayList<Integer> index = new ArrayList<Integer>();
    
    while (left < right){
      sum = num[left] + num[right];
      
      if (sum == target){
        for (int i = 0; i< length; i++){
          if (numbers[i] == num [left]){
            index.add(i+1);
          }
          else if (numbers[i] == num[right]){
            index.add(i+1);
          }
          if (index.size()==2)
            break;
        }
      break;
      }
    
      else if (sum > target){
        --right;
      }
      else {
      ++left;
      }
    }
    int[] result = new int[2];
    result[0]=index.get(0);
    result[1]=index.get(1);
    
    return result;
  }
  
     public static void main(String[] args) {  
        Solution slt = new Solution();  
  
        int[] numbers = { 2, 7, 11, 15 };  
        int target = 9;  
  
        int[] index = new int[2];  
  
        index = slt.twoSum(numbers, target);  
  
        System.out.println("index1=" + index[0] + ", index2=" + index[1]);  
    }  
}
