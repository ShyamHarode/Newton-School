import java.io.*; 
import java.util.*; 

//Solution By Nkr
/*---------------------------------------------------------------------------------------------------------
   *Hints*
   create a method that is going count the no of sub-string using predefined method
   Here in count method we used Tree-set you can also use Hash-set
   in place of String Builder You  can also use array 
   if you need full detailed video  :- then subscribe to this channel if the count of subs increase
   i will surely provide a video on this 
 --------------------------------------------------------------------------------------------------------*/


class Main {
	static int count(String S){
    TreeSet<String> set = new TreeSet<>();
    for(int i = 0; i< S.length(); i++)
        for(int j = i; j< S.length(); j++)
            set.add(S.substring(i, j+1));
     	return set.size();
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = 1;
        while ((len*(len+1))/2 < n)len++;
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i< len; i++){
            for(char ch = 'a'; ch <= 'z'; ch++){
                StringBuilder tmp = new StringBuilder(ans);
                tmp.append(ch);
                char cc = 'z';
                for(int j = i+1; j< len; j++){
                    tmp.append(cc--);
                }
                if(count(tmp.toString()) >= n){
                    ans.append(ch);
                    break;
                }
            }
      
        }
        System.out.println(ans.toString());
  
	}
}
// by ShyamHarode
