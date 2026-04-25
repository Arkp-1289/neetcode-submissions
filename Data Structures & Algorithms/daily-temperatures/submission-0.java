class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<int[]> st = new Stack<>();
         int n=t.length;
        int[] res= new int[n];

       
        for (int i=n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()[0]<=t[i]){
                //   System.out.println(st.peek()[0]);
                st.pop();
            }
            if (st.isEmpty()){
               
                res[i]=0;
            } else{
                // System.out.println(st.peek()[0]);
                res[i]=st.peek()[1]-i;
            }
            st.push(new int[]{t[i],i});
        }
        return res;
        
    }
}
