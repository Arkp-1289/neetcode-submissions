class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
             int n= strs.length;

             Map<String,List<String>> mp = new HashMap<>();

             for (int i=0;i<n;i++){
               char[] chars = strs[i].toCharArray();

               Arrays.sort(chars);
            String sorted = new String(chars);
                  if (mp.get(sorted)==null){
                    mp.put(sorted,new ArrayList<>());
                  }
                //   System.out.println(strs[i]+" "+sorted);
                  mp.get(sorted).add(strs[i]);
             }

             List<List<String>> res = new ArrayList<>();

             for (String lst:mp.keySet()){
                List<String> temp= new ArrayList<>();
                for (String s:mp.get(lst)){
                    temp.add(s);
                }
                res.add(temp);
             }
             return res;
    }
}