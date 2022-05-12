import java.util.*;

public class isSubset {

    public static void main(String[] args) {
      int arr1[] = {1,2,3,4,5,6};
      int arr2 [] = {2,3};
      int m = arr1.length;
      int n = arr2.length;
      
            if(checkIfSubset(arr1, arr2, m, n))
               System.out.print("yes");
            else
            System.out.println("no");

            if(subsetOfArray(arr1, arr2, m, n))
            System.out.print("yes");
           else
           System.out.println("no");

                if(subSet(arr1, arr2, m, n))
                System.out.print("yes");
                else
                System.out.println("no");
    }
  
// Method 1 by Hashmap
public static boolean checkIfSubset(int arr1[], int arr2[], int m, int n ){

        HashMap<Integer, Integer> map =new HashMap<>();

        for(int i =0; i<m; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        for(int i =0; i<n; i++){
            if(!map.containsKey(arr2[i])){
                return false;
            }
            else{
                if(map.containsKey(arr2[i]))
                map.put(arr2[i], map.get(arr2[i])-1);
                if(map.get(arr2[i])==0)
                map.remove(arr2[i]);
            }
        }
        // System.out.println(map);
        return true;


    }

  // method 2 by hashset
public static boolean subsetOfArray(int arr1[], int arr2[], int m, int n) {
    HashSet<Integer> set = new HashSet<>();
    for(int i : arr1)
    set.add(i);
    for(int e : arr2){
        if(!set.contains(e))
        return false;
    }
    return true;
}

  // method 3
public static boolean subSet(int arr[], int brr[], int m, int n){

    Set<Integer> set = new HashSet<>();
    for(int i=0; i<m; i++){
        set.add(arr[i]);
    }
    int size = set.size();
    //after adding second array in set, set size must be same.
    for(int i=0; i<n; i++)
    set.add(brr[i]);

    if(size==set.size())
    return true;

    return false;
}
}
