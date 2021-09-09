package JAXB_javaObjectToXML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;



//JAXB; formerly Java Architecture for XML Binding
public class MarshallingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("hello");
			JAXBContext jaxbContext     = JAXBContext.newInstance( Employee.class );
			Marshaller jaxbMarshaller   = jaxbContext.createMarshaller();
			  jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Employee employeeObj = new Employee( "Lokesh", 1,23, new Department(101, "IT"));
			 
			//Overloaded methods to marshal to different outputs
			  //Print XML String to Console
            jaxbMarshaller.marshal(employeeObj, new File("D:\\MyWorkingDir\\Java8\\CollectionDemo\\src\\main\\java\\JAXB_javaObjectToXML\\employee.xml"));
			System.out.println("hello");
		}catch(Exception e) {
			System.out.println("Exception "+ e.getMessage());
			e.printStackTrace();
		}
	

		
		

	}

}
