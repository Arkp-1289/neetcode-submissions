class Solution {


    public List<List<Integer>> solve(int i,int n,int target,int[] arr,
          List<Integer> l, List<List<Integer>> res){

             if (target==0){
                res.add(new ArrayList<>(l));
                return res;
            }

            if (i==n || target<0){return res;}

           

            l.add(arr[i]);
            // System.out.println(arr[i]+" "+l);
            solve(i+1,n,target-arr[i],arr,l,res);
            l.remove(l.size()-1);

            while (i+1<n && arr[i]==arr[i+1]){
                i++;
            }
            // System.out.println(l);
            solve(i+1,n,target,arr,l,res);
            // System.out.println("res: "+res);
            return res;

          }



    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        List<Integer> l= new ArrayList<>();
        int n= arr.length;
         return solve(0,n,target,arr,l,res);
        
    }
}
