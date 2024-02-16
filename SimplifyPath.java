    public String simplifyPath(String path) {
        Stack<Character> s=new Stack<>();
        path=path+'/';
        for(int i=0;i< path.length() ;i++){
            if(s.size()>0 && path.charAt(i) == '/' && s.peek() == '/'){
                continue;
            }
            
            if(s.size() > 1 && path.charAt(i) == '/' && s.peek() == '.'){
                
                s.pop();
                if(s.peek() == '/'){
                    continue;
                }
                Character f=s.pop();
                if(f =='.' && s.peek() == '/'){
                    if(s.size()>1){
                        s.pop();
                    }
                    
                    while(s.size() > 1 && s.peek() != '/'){
                        s.pop();
                    }
                    continue;
                }
                else{
                    
                    s.push(f);
                    s.push('.');
                    s.push(path.charAt(i));
                    continue;
                }
            }
            s.push(path.charAt(i));
        }
        if(s.size() >1 && s.peek() == '/'){
            s.pop();
        }
        String ans="";
        while(s.size() > 0){
            ans+=s.pop();
        }
       String fAns= reverse(ans);
        return fAns;
    }
    public String reverse(String rev){
        StringBuffer reversed = new StringBuffer(rev).reverse();
        return  reversed.toString();
    }
