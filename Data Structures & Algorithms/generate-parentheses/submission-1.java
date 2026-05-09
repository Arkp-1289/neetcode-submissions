class Solution {


    public boolean valid(StringBuilder s){
        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==')'){
                while (!st.isEmpty() && st.peek()!='('){
                    st.pop();
                }
                if (st.isEmpty()){
                    return false;
                } else{
                    st.pop();
                }
            } else{
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty()?true:false;

    }



    public List<String> solve(int open,int close,int n,StringBuilder s, List<String> res){

        if (open+close==2*n){
            // System.out.println("r------- "+s);
            // if (valid(s)){
                res.add(new String(s.toString()));

            // }
            return res;

        }
        if (open<n){
            s.append("(");
            solve(open+1,close,n,s,res);
            s.deleteCharAt(s.length()-1);
        }

        if (close<open){
            s.append(")");
            solve(open,close+1,n,s,res);
            s.deleteCharAt(s.length()-1);
        }
        return res;


       
    }




    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        StringBuilder s= new StringBuilder();
        return solve(0,0,n,s,res);
        
    }
}
