class Solution {

    public boolean check(int ind,String s,int n ){

                String str = s.substring(0,ind)+s.substring(ind+1,n);
                int left=0,right=n-2;
                while (left<right){
                    if (str.charAt(left)!=str.charAt(right)){return false;}
                    left++;
                    right--;
                }
              
                return true;

    }

    public boolean validPalindrome(String s) {
        
        int n=s.length();
        int left=0,right=n-1;

        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){

                if (check(left,s,n) || check(right,s,n)){
                    return true;
                } 
                return false;

            }
            left++;
            right--;
        }
        return true;

    }
}