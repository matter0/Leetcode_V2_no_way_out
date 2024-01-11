 public int[] productExceptSelf(int[] nums) {
       int[] ltr = new int[nums.length];
       int[] rtl=new int[nums.length];
       int prd=1;
       ltr[0]=1;
       rtl[nums.length-1]=1;
       for(int i=1;i<nums.length;i++){
           prd=prd*nums[i-1];
           ltr[i]=prd;
              
       }
       prd=1;
       for(int i=nums.length-2 ; i>=0;i--){
           prd=prd*nums[i+1];
           rtl[i]=prd;
       }

       for(int i=0;i<nums.length;i++){
           ltr[i]=ltr[i]*rtl[i];
       }
       return ltr;
