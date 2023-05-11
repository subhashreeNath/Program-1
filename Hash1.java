package pracc;

import java.util.HashMap;

public class Hash1 {
	public static void main(String[] args) {
		 // Create a hash map.
		 HashMap<String, Integer> hm = new HashMap<String, Integer>
		();
		 // Put elements into the map
		 hm.put("Mason", new Integer(55));
		 hm.put("Jacob", new Integer(77));
		 hm.put("William", new Integer(99));
		 hm.put("Emma", new Integer(65));
		 System.out.println("Students count :: " + hm.size());
		for(String key : hm.keySet()){
		 System.out.println(key + " score marks :" + hm.get(key));
		 }
		 System.out.println("Emma score available ::" +
		hm.containsKey("Emma"));
		 System.out.println("John score available:: " +
		hm.containsKey("John"));
		 }
		}
