static void circularRotate(Deque<Integer> deq, int d, int n)
{
       for(int i =0; i<(d%n); i++){
               deq.addFirst(deq.removeLast());
       }   
 }
