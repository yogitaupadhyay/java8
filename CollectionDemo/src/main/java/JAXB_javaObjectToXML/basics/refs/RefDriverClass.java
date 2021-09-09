package JAXB_javaObjectToXML.basics.refs;

import java.io.PrintWriter;
import java.util.ArrayList;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class RefDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Ref.class, Book.class, Fiction.class, Horror.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			Ref ref = new Ref();
			ref.books = new ArrayList<Book>();
			ref.books.add(new Fiction(1, "goblet of the fire", "dbihfewrifh", "jk rowling"));
			ref.books.add(new Horror(1, "conjuring", "dbihfewrifh", "someone"));
			jaxbMarshaller.marshal(ref, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}

}
