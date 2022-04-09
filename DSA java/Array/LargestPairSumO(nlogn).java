public class Main {
    public static void main(String[] args) {
       int arr [] = {10, 12, -5, 15, -6};
        int n = arr.length;
        Arrays.sort(arr);
        int large1 = arr[n-1];
        int large2 = arr[n-2];       
        System.out.print(large1 + large2);
    }
}
