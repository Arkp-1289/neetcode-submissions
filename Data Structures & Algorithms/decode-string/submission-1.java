class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        int n =s.length();
        for (int i=0;i<n;i++){
            char ch = s.charAt(i);

            if (ch==']'){
                StringBuilder res = new StringBuilder();

                while (st.peek()!='['){
                    res.append(st.pop());
                }
                st.pop();
                StringBuilder  count= new StringBuilder();
                while (!st.isEmpty() &&  Character.isDigit(st.peek())){
                    count.append(st.pop());
                }
                int c =Integer.parseInt(count.reverse().toString());
                System.out.println(count.reverse().toString()+" count: "+c);
                res.reverse();
                String temp = res.toString();
                for (int j=1;j<c;j++){
                    res.append(temp);
                }
                System.out.println("str: "+res.toString());
                for (int ind=0;ind<res.length();ind++){
                    st.push(res.charAt(ind));
                }

            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
        
    }
}