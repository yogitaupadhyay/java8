package yogita.FunctionalInterface;
interface square{
	public int s(int a );
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square sq=n->n*n;
			System.out.println("square = "+sq.s(10));
			System.out.println("square = "+sq.s(106));
			System.out.println("square = "+sq.s(9));
		

	}

}
