static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
        if(queue.isEmpty()|| k==0)
        return queue;
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<k; i++){
            st.push(queue.remove());
        }
        while(!st.isEmpty()){
            queue.add(st.pop());
        }
        for(int i=0; i<queue.size()-k; i++){
            queue.add(queue.peek());
            queue.remove();
        }
        return queue;
    }
