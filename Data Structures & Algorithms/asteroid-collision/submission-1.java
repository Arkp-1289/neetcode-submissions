class Solution {
    
    Stack<Integer> st = new Stack<>();
    public void check(int val){
        if (st.isEmpty()){
            st.push(val);
            return;
        }

        int top = st.peek();
        if (val>0 || top<0){
            st.push(val);
            return;
        }

        if (top>0 && val<0){
            if (Math.abs(top)==Math.abs(val)){
                st.pop();
                return;
            } else{
                if (Math.abs(top)<Math.abs(val)){
                    st.pop();
                    check(val);
                }
            }
        }
        

    }


    public int[] asteroidCollision(int[] arr) {

        int n=arr.length;
        
        for (int i=0;i<n;i++){

            check(arr[i]);

        }

        ArrayList<Integer> res= new ArrayList<>();
        while (!st.isEmpty()){
            res.add(st.pop());
        }
        int len=res.size();
        int[] ans = new int[len];
        for (int i=0;i<len;i++){
            ans[i]=res.get(len-i-1);
        }
        return ans;
        
    }
}