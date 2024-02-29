package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _5_group_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		
	}
	public static List<List<String>> Anagrams(String[] arr){
		HashMap<String,List<String>> map = new HashMap();
		for(int i = 0;i<arr.length;i++) {
			String key = generateKey(arr[i]);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(arr[i]);
		}
		List<List<String>> ans = new ArrayList<>();
		for(String key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;
	}
	public static String generateKey(String str) {
		int fre[] = new int[26];
		for(int i =  0; i< str.length();i++) {
			char ch = str.charAt(i);
			fre[ch-'a']++;
			
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<fre.length;i++) {
			sb.append(fre[i]);
		}
		return sb.toString();
		
	}
	

}
