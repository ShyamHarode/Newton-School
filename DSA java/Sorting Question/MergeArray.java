import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void merge(int [] arr, int [] brr, int n, int m){
		int ans [] = new int [n+m];
		int i= 0, j=0, k=0;
		while (i<n && j<m){
			if(arr[i]<brr[j]){
			ans[k]= arr[i];
			i++;
			k++;
			} else{
				ans[k]= brr[j];
				j++;
				 k++;
			}
		}
		while (i<n){
			ans[k]=arr[i];
			i++;
			 k++;
		}
		while (j<m){
			ans[k]=brr[j];
			j++;
			 k++;
		}
		// return ans;
		for(k=0; k<n+m; k++)
		System.out.print(ans[k]+ " ");
		
	}
	public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr []= new int [n];
			int brr []= new int [m];
			// int aaa []= new int [n+m];


			for(int i= 0; i<n; i++)
			arr[i]= sc.nextInt();
			for(int i= 0; i<m; i++)
			brr[i]= sc.nextInt();
			merge(arr, brr, n, m);
			// for(int i= 0; i<n+m; i++)
			// System.out.print(aaa[i]+" ");
	}
}
