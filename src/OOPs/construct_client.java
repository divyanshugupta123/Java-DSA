package OOPs;

public class construct_client {

	public static void main(String[] args) {
		construct c=new construct("karna",25);
//		c.name="dev";
//		c.age=-10;
		c.setName("Divyanshu");
		System.out.println(c.getAge());
		System.out.println(c.getName());
		c.fun();
		construct c1=new construct("Naman",37);
//		c1.name="shaggun";
//		c1.age=17;
		c1.fun(); 
	}

}
