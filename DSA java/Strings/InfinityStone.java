import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {

	public static void main (String[] args) {
                      // Your code here

                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
					  String str = new String ();
					  String str1 = sc.next();
					  String str2 = sc.next();
						char [] arr = new char [n];
						char [] arr1 = str1.toCharArray();
						char [] arr2 = str2.toCharArray();
						int diff=0, rotation=0;
						for(int i =0; i<n; i++){
							diff = Math.min(Math.abs(arr1[i]-arr2[i]), 10-Math.abs(arr1[i]-arr2[i]));
							rotation += diff;
						}

					  System.out.print(rotation);
	}
}
//by ShyamHarode
