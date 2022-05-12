import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();

		//Using TreeMap to print ans in lexographical order
		TreeMap<String, Integer> map = new TreeMap<>();
		HashSet<String> set = new HashSet<>();

		for(int i = 0; i < n; i++) {

			String id = sc.next();

			String party = sc.next();

			if(!set.contains(id)) {
				map.put(party, map.getOrDefault(party, 0) + 1);
				set.add(id);
			}
		}

		int maxValue = Collections.max(map.values());
		for(Map.Entry <String, Integer> i : map.entrySet()) {
			if(i.getValue() == maxValue) {
				System.out.println(i.getKey() + " " + i.getValue());
			}
		}
	}
}
