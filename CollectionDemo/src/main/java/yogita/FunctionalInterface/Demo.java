package yogita.FunctionalInterface;

interface hello {
	void sayHello();
}

class helloImpl implements hello {
	public void sayHello() {
		System.out.println("helloo.....");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		helloImpl h = new helloImpl();
		h.sayHello();

		hello h1 = new helloImpl();
		h1.sayHello();

		hello h2 = () -> System.out.println("hello------");
		h2.sayHello();

		// hence lambda expression can be used to provide
		//		implementation to functional interface no need to write 
		//		implementation class
		
		

	}

}
