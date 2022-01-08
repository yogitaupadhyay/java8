package Jackson;

import java.io.File;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		Car car = new Car("yellow", "renault");
		try {
			System.out.println("hello");
			
			objectMapper.writeValue(new File("D:\\MyWorkingDir\\Java8\\CollectionDemo\\src\\main\\java\\Jackson\\car.json"), car);
			String carAsString = objectMapper.writeValueAsString(car);
			System.out.println(carAsString);
			
			
			String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" ,\"list\" : \"[1,2]\" }";
			Car car1 = objectMapper.readValue(json, Car.class);	
			System.out.println("car"+car1);
			
			
			Car car2 = objectMapper.readValue(new File("D:\\MyWorkingDir\\Java8\\CollectionDemo\\src\\main\\java\\Jackson\\car.json"), Car.class);
			System.out.println("car"+car2.toString());
			
//			Car car3 = objectMapper.readValue(new URL("https://reqres.in/api/products/3"), Car.class);
//			System.out.println("car"+car3);
		
			
			String json2 = "{ \"color\" : \"Black\", \"type\" : \"FIAT\" }";
			JsonNode jsonNode = objectMapper.readTree(json2);
			String color = jsonNode.get("color").asText();
			System.out.println(color);
			// Output: color -> Black
			
//			String jsonCarArray = 
//					  "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
//					List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("car exce");
		}
		

	}

}
