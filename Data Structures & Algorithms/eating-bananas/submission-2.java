class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;

        for (int i=0;i<n;i++){
            maxi=Math.max(piles[i],maxi);
        }

        int l=1,r=maxi;
        int res=Integer.MAX_VALUE;

        while (l<=r){
            int mid=(l+r)/2;

            int val=0;


            for (int i=0;i<n;i++){
                // System.out.print(Math.ceil((double) piles[i]/mid)+" ");
                val+=(Math.ceil((piles[i]+mid-1)/mid));
            }
            
            if (val>h){
                l=mid+1;
            } else{
                r=mid-1;
            }
            System.out.println(mid+" "+val);
            if (val<=h){res=Math.min(res,mid);}
        }
        return res;
    }
}
