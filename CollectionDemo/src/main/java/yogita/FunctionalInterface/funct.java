package yogita.FunctionalInterface;

@FunctionalInterface
public interface funct {
//valid
	public void m1();
	default void m2() {
		
	}
	
	public static void m3() {
		
	}
	
	
}
