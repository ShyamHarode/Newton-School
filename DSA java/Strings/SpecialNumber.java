import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next(); // 99

        int sum = 0; 
        for(int i=0; i<number.length(); i++) {
            sum += number.charAt(i) - '0';
        }

        if(sum%3==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
//by ShyamHarode
