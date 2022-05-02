import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		String str= sc.next();
		int n = str.length();
		int count = 0;
		Stack<Integer> s =new Stack<>();
		for(int i=0; i<n; i++){
			char ch = str.charAt(i);
			if(ch=='(')
			s.push(i);
			else{
				if(!s.empty())
				s.pop();
				if(!s.empty())
				count = Math.max(count, i-s.peek());
				else{
					s.push(i);
				}
			}
		}
	System.out.print(count);
	}
}
//by ShyamHarode
