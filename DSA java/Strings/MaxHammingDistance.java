import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      // Your code here
		int max=Integer.MIN_VALUE;
		HashMap<Character,Integer> hm=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		for (int i=0;i<str.length();i++){
               char ch=str.charAt(i);
			   if (hm.containsKey(ch)){
				   int n=hm.get(ch);
				   hm.put(ch,n+1);
				   if (n+1>max)
				   max=n+1;
			   }
			   else 
			   hm.put(ch,1);
		}
		if (max<=(str.length()/2))
		System.out.println(str.length());
		else
		System.out.println(2*(str.length()-max));
	}
}
//by ShyamHarode
