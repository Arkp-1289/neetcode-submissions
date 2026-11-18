class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        int n=s.length();

         int i=0,j=0;
            Set<Character> st = new HashSet<>();
         while (i<n){
            char ch =s.charAt(i);

            while (j<i && st.contains(ch)){
                st.remove(s.charAt(j));
                j++;
            }

            st.add(ch);
            res=Math.max(res,st.size());
            i++;

         }
         return res;
    }
}
