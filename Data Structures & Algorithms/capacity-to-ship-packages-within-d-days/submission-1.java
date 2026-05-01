class Solution {
    public int shipWithinDays(int[] w, int days) {
        int tot_weight = 0;
        int n = w.length;
        int max_weight=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            tot_weight+=w[i];
            max_weight=Math.max(max_weight,w[i]);
        }

        // System.out.println(max_weight+" "+tot_weight);

        int l=max_weight,r=tot_weight;
        int res=Integer.MAX_VALUE;

        while (l<=r){
            int mid=(l+r)/2;

            int c=0;
            int we=0;
            for (int i=0;i<n;i++){
                // System.out.println(we+" "+w[i]);
                if (we+w[i]>mid){
                    // if (i>0){c++;}
                    c++;
                    we=w[i];
                } else{
                    we+=w[i];
                }
            }
            
            
            if (we>0){c++;}
            System.out.println(mid+" -- "+c);

            if (c<=days){
                r=mid-1;
                res=Math.min(mid,res);
            } else{
                l=mid+1;
    
            }
        }
        return res;

        
    }
}