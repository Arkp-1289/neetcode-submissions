class Solution {

    Map<Integer,Boolean> mp = new HashMap<>();
    public boolean solve(int ind,int n,String s,List<String> wordDict){
        
        
        if (ind>=n){return true;}
        if (mp.containsKey(ind)){return mp.get(ind);}
        
        boolean res=false;
        for (String str:wordDict){
            int len=str.length();
            if (ind+len<=n && str.equals(s.substring(ind,ind+len))){
                if (solve(ind+len,n,s,wordDict)){
                    mp.put(ind,true);
                    return true;
                }
            }
        }
        mp.put(ind,false);
        return false;
    }


    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length(),len=0;

        return solve(0,n,s,wordDict);
    
    }
}
