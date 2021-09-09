package JAXB_javaObjectToXML.basics.accessorTypeFolder;

import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;


public class AccessorType_FIELD {

	
	@javax.xml.bind.annotation.XmlAccessorType(XmlAccessType.FIELD)
//	Every non static, non transient field in a JAXB-bound class will be automatically bound to XML, 
//	unless annotated by XmlTransient.
	
	
	@XmlRootElement(name = "Harry potter series")
	static class Book {

		Book() {
			// this is must
		}

		public Book(int id, String name, String isbn, String author) {
			super();
			this.id = id;
			this.name = name;
			this.isbn = isbn;
			this.author = author;
		}

		int id;
		String name;

		String isbn;
		String author;

	}

	public static void main(String[] args) {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Book book = new AccessorType_FIELD.Book(1, "goblet of the fire", "dbihfewrifh", "jk rowling");

			jaxbMarshaller.marshal(book, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}
}
