class Solution {
    public int maxArea(int[] h) {
        int res=0;
        int n=h.length;
        
        int l=0,r=n-1;

        while (l<r){
            // System.out.println(l+" "+r);
            res =Math.max(res,(r-l)*Math.min(h[l],h[r]));
            if (h[l]<=h[r]){l++;}
            else{r--;}
        }
        return res;
        
    }
}
