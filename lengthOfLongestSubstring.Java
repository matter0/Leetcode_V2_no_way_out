 public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length() <=1)
          return s.length();
        int i=0;
        int maxWindow=-1;
        map.put(s.charAt(0),0);
        for(int j=1;j<s.length();j++){
            if(map.containsKey(s.charAt(j)) && (map.get(s.charAt(j)) >= i)){
                
                i=map.get(s.charAt(j));
                map.put(s.charAt(j),j);
                i++;
            }
            else{
                map.put(s.charAt(j),j);
                maxWindow=Math.max(j-i+1,maxWindow);
               
            }
        }
        return maxWindow == -1 ? 1 : maxWindow;
        
    }
