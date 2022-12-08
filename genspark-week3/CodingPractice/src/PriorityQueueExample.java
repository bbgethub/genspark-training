import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> s = Arrays.asList(-10,20,-5);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.addAll(s);
		System.out.println(pq);
		
		List<Integer> s1 = Arrays.asList(-10,20,-5);
		PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
		maxheap.addAll(s1);
		System.out.println( Arrays.toString(maxheap.toArray()));
		
		List<String> s2 = Arrays.asList("CC","EE","aa");
		PriorityQueue<String> maxheapString = new PriorityQueue<>((a, b) -> a.length() - b.length());
		maxheapString.addAll(s2);
		System.out.println( Arrays.toString(maxheapString.toArray()));
		
	}

}
