class Solution {
    public String longestPalindrome(String s) {
        int count=1;
        String res=String.valueOf(s.charAt(0));
        int n=s.length();
        for (int i=0;i<n;i++){
            int l=i-1 ,r=i+1;
            while (l>=0 && r<n && s.charAt(l)==s.charAt(r)){

                if (r-l+1>count){
                    count=(r-l+1);
                    res=s.substring(l,r+1);
                }
                l--;
                r++;
            }
             l=i;r=i+1;
             while (l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                if (r-l+1>count){
                    count=(r-l+1);
                    res=s.substring(l,r+1);
                }
                l--;
                r++;
             }
       
    }
     return res;
}
}
