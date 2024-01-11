HashSet<Integer> list1;
    java.util.Random rand = new java.util.Random();
    public RandomizedSet() {
         list1=new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        if(list1.contains(val)){
            return false;
        }
        else{
            list1.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!list1.contains(val)){
            return false;
        }
        else{
            list1.remove(val);
            return true;
        }
        
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = list1.toArray(new Integer[list1.size()]); 
        int rndmNumber = rand.nextInt(list1.size()); 
        return arrayNumbers[rndmNumber];
    }
