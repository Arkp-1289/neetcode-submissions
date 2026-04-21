class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if (n<=1){
            return n;
        }
        Arrays.sort(arr);
        int res=Integer.MIN_VALUE;
        
        int count=1;
        for (int i=1;i<n;i++){
            if (arr[i]-1==arr[i-1]){count++;}
            else if (arr[i]==arr[i-1]){continue;}
            else{
                    res=Math.max(res,count);
                    count=1;
            }
        }
        res=Math.max(res,count);
        return res;
    }
}
