class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public void removeMinSt(int val){
        if (minSt.peek()==val){
            minSt.pop();
            return ;
        }
        int top=minSt.pop();
        removeMinSt(val);
        minSt.push(top);
    }


    public void addMinStack(int val){

        if (minSt.isEmpty()){
            minSt.push(val);
            return;
        }

        if (minSt.peek()<val){
            int top_ele=minSt.pop();
            addMinStack(val);
            minSt.push(top_ele);
        } else{
            minSt.push(val);
            return;
        }
    }

    public MinStack() {
        st= new Stack<>();
        minSt= new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        addMinStack(val);
    }
    
    public void pop() {
        removeMinSt(st.peek());
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
        
    }
}
