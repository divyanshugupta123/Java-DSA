package generics;

public class _4_car //implements Comparable<_4_car>
{
	int price,speed;
	String color;
	public _4_car() {
		
	}
	public _4_car(int price,int speed,String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	@Override
	public String toString() {
		return "P : "+this.price+" S : "+this.speed+" C : "+this.color;
	}
//	@Override
//	public int compareTo(_4_car o) {
//		// TODO Auto-generated method stub
////		return this.speed - o.speed;  // Ascending order change order for descending order
//		return this.color.compareTo(o.color); // for string data type
//	}
}
