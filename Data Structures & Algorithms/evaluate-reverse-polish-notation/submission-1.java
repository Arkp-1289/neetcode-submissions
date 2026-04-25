class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n=tokens.length;
        for (int i=0;i<n;i++){
            
            String s =tokens[i];
            int val1,val2;
            switch (s){
        
                case "+":
                     val1=st.pop();
                     val2=st.pop();
                    st.push(val1+val2);
                    break;

                case "-":
                     val1=st.pop();
                     val2=st.pop();
                    st.push(val2-val1);
                    break;
                
                case "*":
                     val1=st.pop();
                     val2=st.pop();
                    st.push(val1*val2);
                    break;

                case "/":
                     val1=st.pop();
                     val2=st.pop();
                    st.push(val2/val1);
                    break;
                
                default:
                    st.push(Integer.parseInt(s));
                    break;


            }

        }
        return st.peek();
    }
}
