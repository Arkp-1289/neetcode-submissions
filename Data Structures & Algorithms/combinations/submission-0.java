class Solution {

    public List<List<Integer>> solve(int i, int n, int k, List<Integer> l, List<List<Integer>> res){

        if (k==0){
            res.add(new ArrayList<>(l));
            return res;
        }
        if (k<0 || i>n){return res;}

        l.add(i);
        solve(i+1,n,k-1,l,res);
        l.remove(l.size()-1);
        solve(i+1,n,k,l,res);
        return res;
    }



    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        return solve(1,n,k,l,res);
    }
}