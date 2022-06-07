/*
 static Stack<Integer> s1 = new Stack<Integer>();  
 static Stack<Integer> s2 = new Stack<Integer>();  
*/
  
    static void enQueue(int x)  
    {  
      if(s1.isEmpty()){
        while(!s2.isEmpty()){
          s1.push(s2.pop());
        }
      }
        s2.push(x);
        while(!s1.isEmpty())
        s2.push(s1.pop());

    }  
  
    static void deQueue()  
    {   
     s2.pop();
    } 
    static void Print1(){
      System.out.println(s2.peek());
    }
