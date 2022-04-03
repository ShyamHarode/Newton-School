import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Triangular matrix sum
					  
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr [][] = new int [n][n];
		int i, j;
		int upperSum=0, lowerSum =0;
		  for(i=0; i<n; i++){
			  for(j= 0; j<n; j++)
				  arr [i][j] = sc.nextInt();
			}

			for(i=0; i<n; i++){
			  for(j= i; j<n; j++){
				  upperSum += arr [i][j];
			  }
			}
			for(i=0; i<n; i++){
			  for(j= 0; j<=i; j++){
				  lowerSum += arr [i][j];
			  }
			}
			System.out.print(upperSum + " "+ lowerSum);
	}
}
// by ShyamHarode
