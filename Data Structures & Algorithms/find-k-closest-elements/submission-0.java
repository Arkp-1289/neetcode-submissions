class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int  l=0,r=n-1;
        int ind=-1;
        List<Integer> res = new ArrayList<>();
        while (l<=r){
            int mid=(l+r)/2;
            // System.out.print(arr[mid]+" ");
            if (arr[mid]==x){
                ind=mid;
                break;
            }
            if (arr[mid]>x){
                r=mid-1;
            } else{
                l=mid+1;
            }
        }

        if (ind==-1){ind=l;}

        int left=ind-1,right=ind;
        while (k>0){
            int min_l=Integer.MAX_VALUE,min_r=Integer.MAX_VALUE;
            int min_ind=-1;
            if (left>=0){
                min_l=Math.abs(arr[left]-x);
            }
            if (right<n){
                min_r=Math.abs(arr[right]-x);
            }
            if (min_l<=min_r){
                res.add(arr[left]);
                left--;
            } else{
                res.add(arr[right]);
                right++;
            }
            k--;
        }



       Collections.sort(res);
        return res;
    }
}