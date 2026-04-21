class Solution {

    public String encode(List<String> strs) {
        StringBuilder s= new StringBuilder();
        for (int i=0;i<strs.size();i++){
            s.append(strs.get(i));
            s.append("-");
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int ind=0,n=str.length();
        StringBuilder temp = new StringBuilder();
        while (ind<n){
            if (str.charAt(ind)=='-'){
                res.add(temp.toString());
                // System.out.println(temp.toString());
                temp.delete(0,temp.length());
            } else{
                temp.append(str.charAt(ind));
            }
            ind++;
        }
        return res;
    }
}
