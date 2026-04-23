class Solution {
    public String mergeAlternately(String word1, String word2) {
         int n=word1.length(),m=word2.length();

         int i1=0,i2=0;
        StringBuilder res = new StringBuilder();
        boolean flag=true;
         while (i1<n && i2<m){  
             if (flag){
                res.append(word1.charAt(i1));
                i1++;
             } else{
                res.append(word2.charAt(i2));
                i2++;
             }
             flag=!flag;
         }

         if (i1<n){
            res.append(word1.substring(i1,n));
         }

         if (i2<m){
            res.append(word2.substring(i2,m));
         }
         return res.toString();
    }
}