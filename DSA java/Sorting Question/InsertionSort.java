import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                     
                      Scanner sc = new Scanner (System.in);
                      int t = sc.nextInt();
                      
            while (t-->0){
                int n = sc.nextInt();
                int arr [] = new int [n];
                for (int i =0; i<n; i++)
                arr [i] = sc.nextInt(); 
            insertionSort(arr, n);
            }
	}

    public static void insertionSort(int arr[], int n){
        // int arr [] = new int[n];
         n = arr.length;
        for (int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                // if(arr[j+1]<arr[j]){
                    arr[j+1]=arr[j];
                // }
                j--;
            }
                    arr[j+1]=key;
        } 
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
// by Shyam Harode
