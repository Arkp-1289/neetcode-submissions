class Solution {
    public int maxArea(int[] h) {
        int res=0;
        int n=h.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                res=Math.max(res,(j-i)*Math.min(h[i],h[j]));
            }
        }
        return res;
        
    }
}
