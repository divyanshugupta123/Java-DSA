package Hashmap;

import java.util.ArrayList;

public class _6_hashmap_implementation<K, V> {
	class Node {
		K key;
		V value;
		Node next;

	}

	private ArrayList<Node> ll;
	private int size;

	public _6_hashmap_implementation(int n) {
		ll = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ll.add(null);

		}
	}

	public _6_hashmap_implementation() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public int hashFun(K key) {
		int bn = key.hashCode() % ll.size();
		if (bn < 0) {
			bn = bn + ll.size();

		}
		return bn;

	}

	public void put(K key, V value) {
		int idx = hashFun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;

		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = ll.get(idx);
		nn.next = temp;
		ll.set(idx, nn);
		size++;
//		rehashing
		double thf = 2.0;
		double lf = (1.0*size)/ll.size();
		
		
		
		if(lf > thf) {
//			then we have to do rehashing
			rehashing();
		}
		
		

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> newlist = new ArrayList<>();
		for(int i = 0 ; i < 2 * ll.size();i++) {
			newlist.add(null);
			
		}
		ArrayList<Node> oba = ll;
		ll = newlist;
		for(Node temp : oba) {
			put(temp.key , temp.value);
			temp = temp.next;
		}
	}

	public V get(K key) {
		int idx = hashFun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;

		}
		return null;
	}

	public boolean containsKey(K key) {
		int idx = hashFun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;

		}
		return false;
	}

	public V remove(K key) {
		int idx = hashFun(key);
		Node curr = ll.get(idx);
		Node prev = null;
		while(curr!= null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
			
		}
		if(curr == null) {
			return null;
		}
		else if(prev== null) {
			ll.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;
			
		}
		else {
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
			
		}
	}
	@Override
	public String toString() {
		String s = "{";
		for(Node temp : ll) {
			while(temp != null) {
				s = s+temp.key+"="+temp.value+",";
				temp = temp.next;
				
			}
		}
		return s+"}";
	}

}
