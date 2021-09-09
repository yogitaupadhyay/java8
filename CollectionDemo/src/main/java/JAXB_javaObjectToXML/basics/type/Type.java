package JAXB_javaObjectToXML.basics.type;

import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;




public class Type {

	@XmlType(propOrder  = { "id", "name", "author", "isbn" })
	// @XmlType: Maps a Java class to a schema type. It defines the type
	// name and order of its children.
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
		// TODO Auto-generated method stub
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Book book = new Type.Book(1, "goblet of the fire", "dbihfewrifh", "jk rowling");

			jaxbMarshaller.marshal(book, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}

}
