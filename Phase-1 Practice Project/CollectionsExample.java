package Task;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.LinkedList;

	public class CollectionsExample {

		public static void main(String[] args) {
			// ArrayList example
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Pineapple");
	        arrayList.add("Grapes");
	        arrayList.add("Orange");
	        System.out.println("ArrayList: " + arrayList);

	        // LinkedList example
	        LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("Pink");
	        linkedList.add("Green");
	        linkedList.add("Blue");
	        System.out.println("LinkedList: " + linkedList);

	        // HashSet example
	        HashSet<Integer> hashSet = new HashSet<>();
	        hashSet.add(10);
	        hashSet.add(20);
	        hashSet.add(30);
	        System.out.println("HashSet: " + hashSet);

	        // HashMap example
	        HashMap<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("James", 35);
	        hashMap.put("Jane", 25);
	        hashMap.put("Alice", 36);
	        System.out.println("HashMap: " + hashMap);
	    }

	}

