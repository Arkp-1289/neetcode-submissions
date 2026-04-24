class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        int n=operations.length;

        for (int i=0;i<n;i++){
            String s=operations[i];
            switch (s){
                case "+":
                    int val1=st.pop();
                    int val2=st.pop();
                    st.push(val2);
                    st.push(val1);
                    st.push(val1+val2);
                    break;


                case "C":
                    st.pop();
                    break;

                case "D":
                    int val=st.peek();
                    st.push(2*val);
                    break;

                default:
                  st.push(Integer.parseInt(s));
                  break;

            }
        }


        int res=0;
        while (!st.isEmpty()){
            System.out.println(st.peek());
            res+=st.pop();
        }
        return res;
        
    }
}