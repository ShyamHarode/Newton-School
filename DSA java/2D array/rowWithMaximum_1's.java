import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
	public static void main(String[] args)
    {

					  Scanner sc = new Scanner (System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int mat [][] = new int [R][C];
    
        for (int i=0; i<R; i++){
            for(int j=0; j<C; j++)
            mat [i][j] = sc.nextInt();
        }
        // Initialize first row as row with max 1s
        int j,max_row_index = 0;
            j = C - 1;
 
        for (int i = 0; i < R; i++) {
            // Move left until a 0 is found
            while (j >= 0 && mat[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1
                       // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
          if(max_row_index==0&&mat[0][C-1]==0)
              System.out.print(-1);
        System.out.print(max_row_index);
	}
}
// by ShyamHarode
