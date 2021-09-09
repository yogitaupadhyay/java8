package JAXB_javaObjectToXML.basics.accessorTypeFolder;

import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

public class AccessorType {

	@XmlRootElement(name = "Harry potter series")
	@javax.xml.bind.annotation.XmlAccessorType(XmlAccessType.PROPERTY)
	static class Book {

		// @javax.xml.bind.annotation.XmlAccessorType(XmlAccessType.PROPERTY):
//		Every getter/setter pair in a JAXB-bound class will be automatically bound to XML, 
//		unless annotated by XmlTransient., but it will need setter and getters.
		Book() {
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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		String isbn;
		String author;

	}

	public static void main(String[] args) {

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Book book = new AccessorType.Book(1, "goblet of the fire", "dbihfewrifh", "jk rowling");

			jaxbMarshaller.marshal(book, new PrintWriter(System.out));

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}

}
