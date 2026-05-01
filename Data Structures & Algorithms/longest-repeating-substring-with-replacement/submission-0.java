class Solution {


    public boolean check(Map<Character,Integer> mp,int k){
        int tot=0,maxi=0;

        for (char ch:mp.keySet()){
            tot+=mp.get(ch);
            maxi=Math.max(maxi,mp.get(ch));
        }

        if (tot-maxi<=k){return true;}
        return false;
    }




    public int characterReplacement(String s, int k) {
        
        int l=0,r=0;
        int n=s.length();
        Map<Character,Integer> mp = new HashMap<>();
        int res=0;
        while (r<n){
            char ch =s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            if (check(mp,k)){res=Math.max(res,r-l+1);}
            else{
                while (l<=r && !check(mp,k)){
                   mp.put(s.charAt(l),mp.getOrDefault(s.charAt(l),0)-1);
                     l++; 
                }
                res=Math.max(res,r-l+1);
            }
            r++;
        
        }
        return res;
    }
    
}
