public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length ;i++){
            if(tokens[i].equals("+")){
                int tempAns=s.pop()+s.pop();
                s.push(tempAns);
                continue;
            }
            if(tokens[i].equals("-")){
                int tempAns=-s.pop()+s.pop();
                s.push(tempAns);
                continue;
            }
            if(tokens[i].equals("*")){
                int tempAns=s.pop() * s.pop();
                s.push(tempAns);
                continue;
            }
            if(tokens[i].equals("/")){
                int deno=s.pop();
                int num=s.pop();
                s.push(num/deno);
                continue;
            }
            s.push(Integer.valueOf(tokens[i]));
        }
        return s.pop();
    }
