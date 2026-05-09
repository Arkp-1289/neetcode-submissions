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



    public List<String> solve(int len,int n,StringBuilder s, List<String> res){

        if (len==2*n){
            // System.out.println("r------- "+s);
            if (valid(s)){
                res.add(new String(s.toString()));

            }
            return res;

        }

        s.append("(");
        // System.out.println("b: "+s);
        solve(len+1,n,s,res);
        s.deleteCharAt(s.length()-1);
        s.append(")");
        // System.out.println("a: "+s);
        solve(len+1,n,s,res);
        s.deleteCharAt(s.length()-1);
        return res;
    }




    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        StringBuilder s= new StringBuilder("(");
        return solve(1,n,s,res);
        
    }
}
