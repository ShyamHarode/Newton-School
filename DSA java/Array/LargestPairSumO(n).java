public class Main {
    public static void main(String[] args) {
       int arr [] = {10, 12, -5, 15, -6};
        int n = arr.length;
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        
        for(int i =0; i<n; i++){
            if(arr[i]>large1){
                large2=large1;
                large1=arr[i];
            }
            else if(arr[i]>large2){
                large2 = arr[i];
            }
        }
        System.out.println(large1);
        System.out.println(large2);
        System.out.print(large1 + large2);
    }
}
// O(n) time
