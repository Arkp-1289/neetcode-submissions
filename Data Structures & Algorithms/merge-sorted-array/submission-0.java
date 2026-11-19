class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];

        int i=0,j=0,ind=0;

        while (i<m && j<n){
            if (nums1[i]<nums2[j]){
                temp[ind++]=nums1[i++];
            } else{
                temp[ind++]=nums2[j++];
            }
        }

        while (i<m){
            temp[ind++]=nums1[i++];
        }
        while (j<n){
            temp[ind++]=nums2[j++];
        }

        for (int i1=0;i1<m+n;i1++){
            nums1[i1]=temp[i1];
        }
    }
}