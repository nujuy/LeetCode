public  int lengthOfLongestSubstring(String s){
  if(s==null && s.length == 0){
    return 0; 
  }
  
  HashSet<Character> set = new HashSet<Character>(); //set is used to hold the longest string
  
  int max = 0;
  int head = 0;
  int tail = 0;
  
  while(head < s.length()){
    if(!set.contains(s.charat(head)){
      set.add(s.charAt(head));
    }
    head++;
    
    else{
      if (max < head - tail){
        max = head - tail;
      }
      
    }
  }
  
  
}
