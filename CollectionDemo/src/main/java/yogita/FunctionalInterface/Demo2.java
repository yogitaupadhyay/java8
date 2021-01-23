package yogita.FunctionalInterface;

interface addition{
	public int add(int a ,int b);
}
public class Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	addition add=(a,b)->a+b;
		System.out.println("add="+add.add(10, 20));
		System.out.println("add="+add.add(1700, 20));
		System.out.println("add="+add.add(1055, 2008606));
		System.out.println("add="+add.add(15550, 20));

	}

}
