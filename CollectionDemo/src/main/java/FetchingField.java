import java.lang.reflect.Field;

public class FetchingField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setColor(null);
		car.setId(1);
		car.setName("audi");
		try {

			// get all fields
			System.out.println("all fields" + car.getClass().getDeclaredFields().toString());

			// getting value of one field
			Field field = car.getClass().getDeclaredField("color");
			System.out.println("color: " + field.get(car));

			// checking type
			System.out.println("type of field: " + (field.get(car) instanceof String));

			for (Field f : car.getClass().getSuperclass().getDeclaredFields()) {
				f.setAccessible(true);
				System.out.println(f.getName() + " - " + f.get(car));
				f.setAccessible(false);
			}

			for (Field f : car.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				System.out.println(f.getName() + " - " + f.get(car));
				f.setAccessible(false);
			}
			
		
		} catch (Exception e) {
			System.out.print("e" + e);
		}

	}

}
