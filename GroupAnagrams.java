public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> answer=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String temp=strs[i];
            char[] charTemp=temp.toCharArray();
            Arrays.sort(charTemp);
            String temp_2=Arrays.toString(charTemp);
            if(map.containsKey(temp_2)){
                map.get(temp_2).add(strs[i]);
            }
            else{
                map.put(temp_2,new ArrayList<>());
                map.get(temp_2).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
