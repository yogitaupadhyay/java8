
public class javaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstCor=(Math.atan2(1, 1)*180/Math.PI);
		double secCor=(Math.atan2(1, -1)*180/Math.PI);
		double thirdCor=(Math.atan2(-1, -1)*180/Math.PI);
		double foruthCor=(Math.atan2(-1, 1)*180/Math.PI);
		
		
		System.out.println("firstCor = "+(firstCor+360));
		System.out.println("secCor = "+secCor+360);
		System.out.println("thirdCor= "+thirdCor+360);
		System.out.println("foruthCor= "+foruthCor+360);
	
		System.out.println("diff = "+(firstCor-thirdCor));
		
		
		
		
		System.out.println("diff = "+(foruthCor-secCor));
	}

}
