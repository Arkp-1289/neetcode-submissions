class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Stack<Double> st = new Stack<>();

        int n=position.length;

        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->{
            if (a[0]!=b[0]){
                return Integer.compare(b[0],a[0]);
            }
            return Integer.compare(a[1],b[1]);
        });

        for (int i=0;i<n;i++){
                Double time=(double) (target-arr[i][0])/arr[i][1];
                
                System.out.println(arr[i][0]+" "+arr[i][1]+" "+time);

                if (st.isEmpty()){st.push(time);continue;}

                if (st.peek()>=time){
                    continue;
                } 

                st.push(time);
                
            
        }
        return st.size();
    }
}
