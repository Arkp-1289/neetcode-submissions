/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int findPeek(MountainArray marr){
        int n=marr.length();
        int l=1,r=n-2;

        while (l<=r){
            int mid=(l+r)/2;
            if (marr.get(mid)>marr.get(mid-1) && marr.get(mid)>marr.get(mid+1)){
                return mid;
            }
            if (marr.get(mid)>marr.get(mid-1)){
                l=mid+1;
            } else{
                r=mid-1;
            }
        }
        return -1;

    }


    public int findInMountainArray(int target, MountainArray marr) {

        int peek = findPeek(marr);
        System.out.println("peek: "+peek);
        int n=marr.length();
        int l1=0,r1=peek;

        while (l1<=r1){
            int mid1=(l1+r1)/2;
            if(marr.get(mid1)==target){return mid1;}

            if (marr.get(mid1)<target){
                l1=mid1+1;
            } else{
                r1=mid1-1;
            }
        }

        int l2=peek+1,r2=n-1;

        while (l2<=r2){
            int mid2=(l2+r2)/2;
            if (marr.get(mid2)==target){return mid2;}

            if (marr.get(mid2)<target){
                r2=mid2-1;
            } else{
                l2=mid2+1;
            }
        }
        return -1;


        
    }
}