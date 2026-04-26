class Solution {
    public int mySqrt(int x) {

        long l=1,r=x;

        while (l<=r){
            long mid = (l+r)/2;
            // System.out.println(mid);
            if (mid*mid==x){
                return (int) mid;
            }
            if (mid*mid>x){
                r=mid-1;
            } else{
                l=mid+1;
            }
        }
        return (int) l-1;
        
    }
}