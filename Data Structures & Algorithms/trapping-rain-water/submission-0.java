class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int[] pre_max= new int[n];
        int[] suf_max= new int[n];
        pre_max[0]=height[0];
        suf_max[n-1]=height[n-1];
        for (int i=1;i<n;i++){
            pre_max[i]=Math.max(height[i],pre_max[i-1]);
            suf_max[n-i-1]=Math.max(height[n-i-1],suf_max[n-i]);
        }

        int res=0;
        for (int i=0;i<n;i++){
            res+=(Math.min(pre_max[i],suf_max[i])-height[i]);
        }
        return res;

        

    }
}
