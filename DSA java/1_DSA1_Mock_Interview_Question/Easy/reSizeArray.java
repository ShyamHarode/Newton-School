import java.util.Arrays;

// reduce the size of array according to odd number.
public class reduceArraySize {
  public static void main(String[] args) {
      int[] arr = {1,2,3,3,6,5,4,5,65,6,52};

      int j=0;
      for(int i:arr){
          if(i%2==1){
              arr[j] =i;
              j++;
          }
      }
      int [] brr = Arrays.copyOfRange(arr, 0, j);
      for(int e : brr)
      System.out.print(e +" ");
    
    // arr = Arrays.copyOf(arr, j);
    // for(int e : arr)
    // System.out.print(e +" ");
  }  
}
