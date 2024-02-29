package Hashmap;

public class _7_hashmap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_6_hashmap_implementation<String, Integer> map = new _6_hashmap_implementation<>();
		map.put("raj", 68);
		map.put("Kunal", 8);
		map.put("Ankita", 58);
		map.put("Ankit", 63);
		map.put("pooja", 72);
		map.put("shiva", 23);
		System.out.println(map.containsKey("pooja"));
		System.out.println(map.get("pooja"));
		System.out.println();
	}

}
