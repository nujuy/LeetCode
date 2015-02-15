public  int lengthOfLongestSubstring(String s){
  if(s==null && s.length() == 0){
    return 0; 
  }
  
  HashSet<Character> set = new HashSet<Character>(); //set is used to hold the longest string
  
  int max = 0;
  int head = 0;
  int tail = 0;
  
  while(head < s.length()){
    if(set.contains(s.charAt(head))){
      if (max < head - tail){
        max = head - tail;
      }
      while(s.charAt(tail)!=s.charAt(head)){
        set.remove(s.charAt(tail));
        tail++;
      }
      tail++;
    }
    
    else{
      set.add(s.charAt(head));
    }
    head++;
  }
  
  max = Math.max(max, head-tail);
  return max;
  
}
