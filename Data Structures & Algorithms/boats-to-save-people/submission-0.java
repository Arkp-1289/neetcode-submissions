class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int n=people.length;
        int l=0,r=n-1;
        int res=0;
        Arrays.sort(people);
        while (l<r){
            int weight=people[l]+people[r];
            if (weight<=limit){
                res++;
                l++;
                r--;
            } else{
                res++;
                r--;
            }
        }
        if (l==r){res++;}
        return res;
    }
}