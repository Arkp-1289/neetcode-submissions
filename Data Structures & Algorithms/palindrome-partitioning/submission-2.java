class Solution {

    public boolean checkPalindrome(String s){
        int len=s.length();
        int l=0,r=len-1;
        while (l<=r){
            if (s.charAt(l)!=s.charAt(r)){return false;}
            l++;
            r--;
        }
        return true;
    }

    public List<List<String>> solve(int ind,int n, String s,List<String>l,List<List<String>>res){

      

        if (ind>=n){
            res.add(new ArrayList<>(l));
            return res;
        }

        StringBuilder str = new StringBuilder();
        for (int i=ind;i<n;i++){
            str.append(s.charAt(i));
              if (checkPalindrome(str.toString())){
                 l.add(str.toString());
                solve(i+1,n,s,l,res);
                l.remove(l.size()-1);
            
            }
           
        }
        return res;
    }


    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        List<String> l = new ArrayList<>();
        int n=s.length();
        StringBuilder str= new StringBuilder();
        for (int i=0;i<n;i++){
            str.append(s.charAt(i));
            if (checkPalindrome(str.toString())){
                 l.add(str.toString());
                solve(i+1,n,s,l,res);
                l.remove(l.size()-1);
            
            }
        }
        return res;
        
    }
}
